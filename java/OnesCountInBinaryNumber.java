package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-02
 */
public class OnesCountInBinaryNumber {
    public int hammingWeight(int n) {
        int numOnes = 0;
        while (n != 0) {
            numOnes += (n & 1);
            n = n >>> 1;
        }
        return numOnes;
    }

    public static void main(String[] args) {
        System.out.println(new OnesCountInBinaryNumber().hammingWeight(5));
    }
}
