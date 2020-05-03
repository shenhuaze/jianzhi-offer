package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-03
 */
public class PowXn {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }
        if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PowXn().myPow(2, -2));
    }
}
