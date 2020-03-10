package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-10
 */
public class Fibonacci {
    // 0 1 2 3 4 5 6 7  8  9
    // 0 1 1 2 3 5 8 13 21 34
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 2] % 1000000007 + result[i - 1] % 1000000007;
        }
        return result[n] % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(48));
    }
}
