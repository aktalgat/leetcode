package io.talgat.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @link https://leetcode.com/problems/unique-email-addresses
 */
public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] e = email.split("@");
            String name = e[0];
            String domain = e[1];
            int p = name.indexOf("+");
            if (p != -1) {
                name = name.substring(0, p);
            }
            name = name.replace(".", "");
            set.add(name + "@" + domain);
        }
        return set.size();
    }
}
