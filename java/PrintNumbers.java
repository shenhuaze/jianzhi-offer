package com.huaze.shen;

import java.util.Arrays;

/**
 * @author Huaze Shen
 * @date 2020-05-03
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            maxNum += 9 * Math.pow(10, i);
        }
        int[] result = new int[maxNum];
        for (int i = 0; i < maxNum; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = new PrintNumbers().printNumbers(1);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
