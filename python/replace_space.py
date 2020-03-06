# @author Huaze Shen
# @date 2020-03-06


def replace_space(s: str) -> str:
    return s.replace(" ", "%20")


if __name__ == '__main__':
    print(replace_space("We are happy."))
