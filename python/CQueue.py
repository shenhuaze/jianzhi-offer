# @author Huaze Shen
# @date 2020-03-09


class CQueue:
    def __init__(self):
        self.size = 0
        self.stack1 = []
        self.stack2 = []

    def append_tail(self, value: int) -> None:
        while len(self.stack1) > 0:
            self.stack2.append(self.stack1.pop())
        self.stack1.append(value)
        while len(self.stack2) > 0:
            self.stack1.append(self.stack2.pop())
        self.size += 1

    def delete_head(self) -> int:
        if self.size == 0:
            return -1
        self.size -= 1
        return self.stack1.pop()


if __name__ == '__main__':
    obj = CQueue()
    obj.append_tail(1)
    param_2 = obj.delete_head()
