#include <iostream>
#include <vector>

using namespace std;

bool Search(string word, int index, vector<vector<char>>& board, int i, int j) {
    if (index == word.size()) {
        return true;
    }
    if (i < 0 || i >= board.size() || j < 0 || j >= board[0].size() || board[i][j] == '#' || board[i][j] != word[index]) {
        return false;
    }
    char ch = board[i][j];
    board[i][j] = '#';
    bool result = (
            Search(word, index + 1, board, i - 1, j) ||
            Search(word, index + 1, board, i + 1, j) ||
            Search(word, index + 1, board, i, j - 1) ||
            Search(word, index + 1, board, i, j + 1)
            );
    board[i][j] = ch;
    return result;
}

bool Exist(vector<vector<char>>& board, string word) {
    if (board.empty() || board[0].empty()) {
        return false;
    }
    int m = board.size();
    int n = board[0].size();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (Search(word, 0, board, i, j)) {
                return true;
            }
        }
    }
    return false;
}

int main() {
    vector<vector<char>> board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };
    string word = "ABCCED";
    cout << Exist(board, word);
    return 0;
}