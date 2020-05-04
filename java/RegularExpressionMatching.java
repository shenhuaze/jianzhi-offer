package com.huaze.shen;

/**
 * @author Huaze Shen
 * @date 2020-05-04
 *
 * 关键是状态转移方程
 * p.charAt(j) == s.charAt(i) : dp[i][j] = dp[i-1][j-1]
 * If p.charAt(j) == ‘.’ : dp[i][j] = dp[i-1][j-1];
 *
 * If p.charAt(j) == ‘*’:
 * here are two sub conditions:
 *   if p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2] //in this case, a* only counts as empty
 *   if p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == ‘.’:
 *       dp[i][j] = dp[i-1][j] // in this case, a* counts as multiple a
 *       dp[i][j] = dp[i][j-1] // in this case, a* counts as single a
 *       dp[i][j] = dp[i][j-2] // in this case, a* counts as empty
 * 示例
 * s\p ""  a  *  b  *
 * ""   1  0  1  0  1
 *  a   0  1  1  0  1
 *  a   0  0  1  0  1
 *  a   0  0  1  0  1
 *  a   0  0  1  0  1
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        // 初始化第一行，p匹配s = ""
        for (int i = 1; i < n; i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // p[j - 1]不是"*"的情况，单字符匹配
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // p[j - 1]是"*"的情况，则要判断p[j - 2]是否匹配当前s[i - 1]
                // 若不匹配，则p[j - 1]匹配空字符串
                // 否则，有三种情况：
                //   1.p[j - 1]匹配空字符串；
                //   2.p[j - 1]匹配单一s[i - 1]字符；
                //   3.p[j - 1]匹配多个s[i - 1]字符
                if (p.charAt(j - 1) == '*') {
                    if (p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.') {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j];
                    }
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        System.out.println(new RegularExpressionMatching().isMatch(s, p));
    }
}
