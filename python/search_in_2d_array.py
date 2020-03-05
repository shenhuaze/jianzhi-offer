# @author Huaze Shen
# @date 2020-03-05

from typing import List


def find_number_in_2d_array(matrix: List[List[int]], target: int) -> bool:
    if matrix is None or len(matrix) == 0 or matrix[0] is None or len(matrix[0]) == 0:
        return False
    m = len(matrix)
    n = len(matrix[0])
    row = 0
    col = n - 1
    while row < m and col >= 0:
        value = matrix[row][col]
        if target < value:
            col -= 1
        elif target > value:
            row += 1
        else:
            return True
    return False


if __name__ == '__main__':
    matrix_ = [
        [1, 4, 7, 11, 15],
        [2, 5, 8, 12, 19],
        [3, 6, 9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
    ]
    # target_ = 20
    target_ = 5
    print(find_number_in_2d_array(matrix_, target_))
