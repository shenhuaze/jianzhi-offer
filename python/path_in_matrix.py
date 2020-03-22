# @author Huaze Shen
# @date 2020-03-22

from typing import List


def exist(board: List[List[str]], word: str) -> bool:
    if board is None or len(board) == 0 or board[0] is None or len(board[0]) == 0:
        return False
    m = len(board)
    n = len(board[0])
    for i in range(m):
        for j in range(n):
            if search(word, 0, board, i, j):
                return True
    return False


def search(word, index, board, i, j):
    """
    board中从第[i, j]字符开始，能否找到一条包含word[index:]字符串的路径
    """
    if index == len(word):
        return True
    if i < 0 or i >= len(board) or j < 0 or j >= len(board[0]) or board[i][j] == "#" or board[i][j] != word[index]:
        return False
    ch = board[i][j]
    board[i][j] = "#"
    result = (search(word, index + 1, board, i - 1, j) or
              search(word, index + 1, board, i + 1, j) or
              search(word, index + 1, board, i, j - 1) or
              search(word, index + 1, board, i, j + 1))
    board[i][j] = ch
    return result


if __name__ == '__main__':
    board_ = [
        ['A', 'B', 'C', 'E'],
        ['S', 'F', 'C', 'S'],
        ['A', 'D', 'E', 'E']
    ]
    word_ = "ABCCED"
    print(exist(board_, word_))
