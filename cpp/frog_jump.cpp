#include <iostream>

using namespace std;

int NumWays(int n) {
    int a = 1;
    int b = 2;
    for (int i = 1; i < n; i++) {
        int c = (a + b) % 1000000007;
        a = b;
        b = c;
    }
    return a;
}

int main() {
    cout << NumWays(3);
    return 0;
}