# @author Huaze Shen
# @date 2020-03-27


def moving_count(m: int, n: int, k: int) -> int:
    visited = [[0 for i in range(n)] for i in range(m)]
    count = 0
    q = [(0, 0)]
    visited[0][0] = 1
    count += 1
    while len(q) > 0:
        point = q.pop(0)
        for neighbor in get_neighbors(point):
            if is_valid(neighbor, m, n, k, visited):
                q.append(neighbor)
                count += 1
                visited[neighbor[0]][neighbor[1]] = 1
    return count


def get_neighbors(point):
    x = point[0]
    y = point[1]
    return [(x + 1, y), (x, y + 1)]


def is_valid(point, m, n, k, visited):
    x = point[0]
    y = point[1]
    if x < 0 or x >= m or y < 0 or y >= n:
        return False
    if visited[x][y] == 1:
        return False
    s = 0
    while x > 0:
        s += x % 10
        x //= 10
    while y > 0:
        s += y % 10
        y //= 10
    return s <= k


if __name__ == '__main__':
    print(moving_count(1, 2, 1))
