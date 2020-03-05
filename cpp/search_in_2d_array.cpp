#include <iostream>
#include <vector>

using namespace std;

bool FindNumberIn2DArray(vector<vector<int>>& matrix, int target) {
    if (matrix.empty() || matrix[0].empty()) {
        return false;
    }
    int m = matrix.size();
    int n = matrix[0].size();
    int row = 0;
    int col = n - 1;
    while (row < m && col >= 0) {
        int value = matrix[row][col];
        if (target < value) {
            col -= 1;
        } else if (target > value) {
            row += 1;
        } else {
            return true;
        }
    }
    return false;
}

int main() {
    vector<vector<int>> matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
    };
    int target = 5;
    cout << FindNumberIn2DArray(matrix, target);
    return 0;
}