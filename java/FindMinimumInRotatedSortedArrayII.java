package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-13
 */
public class FindMinimumInRotatedSortedArrayII {
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int num: numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 2, 0, 1};
        System.out.println(new FindMinimumInRotatedSortedArrayII().minArray(numbers));
    }
}
