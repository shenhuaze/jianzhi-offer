# @author Huaze Shen
# @date 2020-03-13


def num_ways(n: int) -> int:
    a = 1
    b = 2
    for i in range(1, n):
        c = (a + b) % 1000000007
        a = b
        b = c
    return a


if __name__ == '__main__':
    print(num_ways(3))
