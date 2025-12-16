package io.talgat.easy;

/**
 * https://leetcode.com/problems/defanging-an-ip-address
 */
public class DefangingIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
