#include <iostream>

using namespace std;

int CuttingRope(int n) {
    if (n == 2) {
        return 1;
    }
    if (n == 3) {
        return 2;
    }
    long result = 1;
    while (n > 4) {
        result = (result * 3) % 1000000007;
        n -= 3;
    }
    result = (result * n) % 1000000007;
    return (int)result;
}

int main() {
    cout << CuttingRope(10);
    return 0;
}