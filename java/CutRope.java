package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-04-03
 */
public class CutRope {
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        result *= n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CutRope().cuttingRope(10));
    }
}
