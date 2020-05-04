# @author Huaze Shen
# @date 2020-05-04

from typing import List


def exchange(nums: List[int]) -> List[int]:
    left = 0
    right = len(nums) - 1
    while left < right:
        while left < len(nums) and nums[left] % 2 == 1:
            left += 1
        while right >= 0 and nums[right] % 2 == 0:
            right -= 1
        if left < right and left < len(nums) and right >= 0:
            temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left += 1
            right -= 1
    return nums


if __name__ == '__main__':
    nums_ = [1, 11, 14]
    print(exchange(nums_))
