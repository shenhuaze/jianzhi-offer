# @author Huaze Shen
# @date 2020-05-04

import re


def is_number(s: str) -> bool:
    if s is None or len(s.strip()) == 0:
        return False
    regex = "[-+]?(?:[0-9]+\\.?|\\.[0-9]+)[0-9]*(?:e[-+]?[0-9]+)?"
    return re.fullmatch(regex, s.strip()) is not None


if __name__ == '__main__':
    print(is_number("+10.0"))
