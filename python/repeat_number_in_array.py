# @author Huaze Shen
# @date 2020-03-04

from typing import List


def find_repeat_number(nums: List[int]) -> int:
    count = [0 for i in range(len(nums))]
    for num in nums:
        count[num] += 1
        if count[num] > 1:
            return num
    return 0


if __name__ == '__main__':
    nums_ = [2, 3, 1, 0, 2, 5, 3]
    print(find_repeat_number(nums_))
