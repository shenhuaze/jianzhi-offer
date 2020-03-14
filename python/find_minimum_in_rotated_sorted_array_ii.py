# @author Huaze Shen
# @date 2020-03-13

from typing import List


def min_array(numbers: List[int]) -> int:
    min_val = numbers[0]
    for num in numbers:
        if num < min_val:
            min_val = num
    return min_val


if __name__ == '__main__':
    numbers_ = [2, 2, 2, 0, 1]
    print(min_array(numbers_))
