# @author Huaze Shen
# @date 2020-05-02


def cutting_rope(n: int) -> int:
    if n == 2:
        return 1
    if n == 3:
        return 2
    result = 1
    while n > 4:
        result = (result * 3) % 1000000007
        n -= 3
    result = (result * n) % 1000000007
    return result


if __name__ == '__main__':
    print(cutting_rope(10))
