#include <iostream>
#include <queue>

using namespace std;

struct Point {
    int x;
    int y;
};

vector<Point> GetNeighbors(Point point) {
    vector<Point> neighbors;
    neighbors.push_back({point.x + 1, point.y});
    neighbors.push_back({point.x, point.y + 1});
    return neighbors;
}

bool IsValid(Point point, int m, int n, int k, vector<vector<int>>& visited) {
    int x = point.x;
    int y = point.y;
    if (x < 0 || x >= m || y < 0 || y >= n) {
        return false;
    }
    if (visited[x][y] == 1) {
        return false;
    }
    int sum = 0;
    while (x > 0) {
        sum += x % 10;
        x /= 10;
    }
    while (y > 0) {
        sum += y % 10;
        y /= 10;
    }
    return sum <= k;
}

int MovingCount(int m, int n, int k) {
    vector<vector<int>> visited(m, vector<int>(n));
    int count = 0;
    queue<Point> q;
    q.push({0, 0});
    count += 1;
    visited[0][0] = 1;
    while (!q.empty()) {
        auto point = q.front();
        q.pop();
        for (auto neighbor: GetNeighbors(point)) {
            if (IsValid(neighbor, m, n, k, visited)) {
                q.push({neighbor.x, neighbor.y});
                visited[neighbor.x][neighbor.y] = 1;
                count += 1;
            }
        }
    }
    return count;
}


int main() {
    cout << MovingCount(3, 2, 17);
    return 0;
}