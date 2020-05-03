# @author Huaze Shen
# @date 2020-05-03


def my_pow(x: float, n: int) -> float:
    if n < 0:
        return 1.0 / helper(x, -n)
    return helper(x, n)


def helper(x, n):
    if n == 0:
        return 1
    half = helper(x, n // 2)
    if n % 2 == 0:
        return half * half
    if n > 0:
        return half * half * x
    else:
        return half * half / x


if __name__ == '__main__':
    print(my_pow(2, -2))
