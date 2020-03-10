#include <iostream>

using namespace std;

int Fib(int n) {
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
        int c = (a + b) % 1000000007;
        a = b;
        b = c;
    }
    return a;
}

int main() {
    cout << Fib(48);
    return 0;
}