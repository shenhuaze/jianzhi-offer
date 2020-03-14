package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-13
 */
public class FrogJump {
    public int numWays(int n) {
        int a = 1;
        int b = 2;
        for (int i = 1; i < n; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJump().numWays(3));
    }
}
