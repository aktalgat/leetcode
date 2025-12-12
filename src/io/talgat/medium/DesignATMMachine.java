package io.talgat.medium;

/**
 * https://leetcode.com/problems/design-an-atm-machine
 */
public class DesignATMMachine {

    class ATM {
        long[] bank = new long[5];
        int[] values = new int[] {20 , 50, 100, 200, 500};

        public ATM() {

        }

        public void deposit(int[] banknotesCount) {
            for (int i = 0; i < 5; i++) {
                bank[i] += banknotesCount[i];
            }
        }

        public int[] withdraw(int amount) {
            int[] used = new int[5];
            int remaining = amount;
            for (int i = 4; i >= 0; i--) {
                int take = (int) Math.min(bank[i], remaining / values[i]);
                used[i] = take;
                remaining -= take * values[i];
            }
            if (remaining != 0) {
                return new int[] {-1};
            }
            for (int i = 0; i < 5; i++) {
                bank[i] -= used[i];
            }
            return used;
        }
    }

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
}
