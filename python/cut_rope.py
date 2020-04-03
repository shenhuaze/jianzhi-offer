# @author Huaze Shen
# @date 2020-04-03


def cutting_rope(n: int) -> int:
    if n == 2:
        return 1
    if n == 3:
        return 2
    result = 1
    while n > 4:
        result *= 3
        n -= 3
    result *= n
    return result


if __name__ == '__main__':
    print(cutting_rope(10))
