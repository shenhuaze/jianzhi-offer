#include <iostream>

using namespace std;

bool IsMatch(string s, string p) {
    int m = s.size();
    int n = p.size();
    bool dp[m + 1][n + 1];
    for(int i = 0; i < m + 1; i++) {
        for (int j = 0; j < n + 1; j++) {
            dp[i][j] = false;
        }
    }
    dp[0][0] = true;
    for (int i = 1; i < n; i++) {
        if (p[i] == '*' && dp[0][i - 1]) {
            dp[0][i + 1] = true;
        }
    }
    for (int i = 1; i < m + 1; i++) {
        for (int j = 1; j < n + 1; j++) {
            if (p[j - 1] == '.' || p[j - 1] == s[i - 1]) {
                dp[i][j] = dp[i - 1][j - 1];
            }
            if (p[j - 1] == '*') {
                if (p[j - 2] != s[i - 1] && p[j - 2] != '.') {
                    dp[i][j] = dp[i][j - 2];
                } else {
                    dp[i][j] = (dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j]);
                }
            }
        }
    }
    return dp[m][n];
}

int main() {
    cout << IsMatch("aa", "a*");
    return 0;
}