package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-04
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }
        String regex = "[-+]?(?:[0-9]+\\.?|\\.[0-9]+)[0-9]*(?:e[-+]?[0-9]+)?";
        return s.trim().matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(new ValidNumber().isNumber("+100"));
    }
}
