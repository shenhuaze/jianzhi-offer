# @author Huaze Shen
# @date 2020-05-02


def hamming_weight(n: int) -> int:
    num_ones = 0
    while n != 0:
        num_ones += (n & 1)
        n = n >> 1
    return num_ones


if __name__ == '__main__':
    print(hamming_weight(5))
