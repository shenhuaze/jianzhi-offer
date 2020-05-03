# @author Huaze Shen
# @date 2020-05-03

from typing import List


def print_numbers(n: int) -> List[int]:
    result = []
    max_num = 0
    for i in range(n):
        max_num += 9 * 10 ** i
    for i in range(max_num):
        result.append(i + 1)
    return result


if __name__ == '__main__':
    print(print_numbers(2))
