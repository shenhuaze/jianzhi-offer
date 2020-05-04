package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-04
 */
public class ExchangeOddEvenNumber {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && nums[left] % 2 == 1) {
                left += 1;
            }
            while (right >= 0 && nums[right] % 2 == 0) {
                right -= 1;
            }
            if (left < right && left < nums.length) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 11, 14};
        int[] result = new ExchangeOddEvenNumber().exchange(nums);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
