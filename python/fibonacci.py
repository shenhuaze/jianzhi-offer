# @author Huaze Shen
# @date 2020-03-10


def fib(n: int) -> int:
    a = 0
    b = 1
    for i in range(n):
        c = (a + b) % 1000000007
        a = b
        b = c
    return a


if __name__ == '__main__':
    print(fib(48))
