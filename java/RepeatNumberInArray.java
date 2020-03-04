package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-03-04
 */
public class RepeatNumberInArray {
    public int findRepeatNumber(int[] nums) {
        int[] count = new int[nums.length];
        for (int num: nums) {
            count[num] += 1;
            if (count[num] > 1) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new RepeatNumberInArray().findRepeatNumber(nums));
    }
}
