package io.talgat.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Interview-ready in-memory Bank:
 * - createAccount
 * - deposit / withdraw
 * - transfer (deadlock-free via deterministic lock ordering)
 * - activity tracking (+1 on add/remove)
 * - topKAccounts by most activity
 *
 * Notes:
 * - Money is stored in cents (long) to avoid floating point issues.
 * - accounts/activity maps are ConcurrentHashMap for safe concurrent access.
 * - Balance mutations are protected by per-account locks (synchronized(account)).
 */
public class Bank {

    private final Map<String, Account> accounts = new ConcurrentHashMap<>();
    private final Map<String, Long> activity = new ConcurrentHashMap<>();

    // ---------- Public API ----------

    public void createAccount(String accountId) {
        validateAccountId(accountId);
        Account prev = accounts.putIfAbsent(accountId, new Account(accountId));
        if (prev != null) {
            throw new IllegalStateException("Account already exists: " + accountId);
        }
        activity.put(accountId, 0L);
    }

    public long getBalance(String accountId) {
        Account a = getAccount(accountId);
        synchronized (a) {
            return a.balanceCents;
        }
    }

    public void deposit(String accountId, long amountCents) {
        validateAmount(amountCents);
        Account a = getAccount(accountId);
        synchronized (a) {
            a.balanceCents += amountCents;
        }
        incActivity(accountId); // +1 activity for adding money
    }

    public void withdraw(String accountId, long amountCents) {
        validateAmount(amountCents);
        Account a = getAccount(accountId);
        synchronized (a) {
            if (a.balanceCents < amountCents) {
                throw new IllegalStateException("Insufficient funds");
            }
            a.balanceCents -= amountCents;
        }
        incActivity(accountId); // +1 activity for removing money
    }

    /**
     * Transfer amountCents from fromId to toId.
     * Activity rules:
     * - removing from source => +1
     * - adding to destination => +1
     */
    public void transfer(String fromId, String toId, long amountCents) {
        validateAccountId(fromId);
        validateAccountId(toId);
        validateAmount(amountCents);

        if (fromId.equals(toId)) {
            throw new IllegalArgumentException("Cannot transfer to the same account");
        }

        Account from = getAccount(fromId);
        Account to = getAccount(toId);

        // Deterministic lock ordering to avoid deadlocks (e.g., A->B and B->A concurrently).
        Account first = from.id.compareTo(to.id) < 0 ? from : to;
        Account second = first == from ? to : from;

        synchronized (first) {
            synchronized (second) {
                if (from.balanceCents < amountCents) {
                    throw new IllegalStateException("Insufficient funds");
                }
                from.balanceCents -= amountCents;
                to.balanceCents += amountCents;
            }
        }

        incActivity(fromId);
        incActivity(toId);
    }

    /**
     * Returns top K accountIds by highest activity count.
     * Tie-breaker: accountId ascending (stable, deterministic).
     *
     * Complexity: O(N log N) per query (simple and correct).
     */
    public List<String> topKAccounts(int k) {
        if (k <= 0) return List.of();

        List<Map.Entry<String, Long>> list = new ArrayList<>(activity.entrySet());
        list.sort((e1, e2) -> {
            int cmp = Long.compare(e2.getValue(), e1.getValue());
            return (cmp != 0) ? cmp : e1.getKey().compareTo(e2.getKey());
        });

        int limit = Math.min(k, list.size());
        List<String> res = new ArrayList<>(limit);
        for (int i = 0; i < limit; i++) {
            res.add(list.get(i).getKey());
        }
        return res;
    }

    // ---------- Helpers ----------

    private void incActivity(String accountId) {
        // Thread-safe atomic increment
        activity.merge(accountId, 1L, Long::sum);
    }

    private Account getAccount(String accountId) {
        Account a = accounts.get(accountId);
        if (a == null) {
            throw new IllegalArgumentException("Account not found: " + accountId);
        }
        return a;
    }

    private static void validateAmount(long amountCents) {
        if (amountCents <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
    }

    private static void validateAccountId(String accountId) {
        if (accountId == null || accountId.isBlank()) {
            throw new IllegalArgumentException("accountId is required");
        }
    }

    // ---------- Entity ----------

    private static final class Account {
        final String id;
        long balanceCents;

        Account(String id) {
            this.id = id;
            this.balanceCents = 0L;
        }
    }
}