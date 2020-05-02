package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-02
 */
public class CutRopeII {
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        long result = 1;
        while (n > 4) {
            result = (result * 3) % 1000000007;
            n -= 3;
        }
        result = (result * n) % 1000000007;
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(new CutRopeII().cuttingRope(10));
    }
}
