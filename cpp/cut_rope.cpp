#include <iostream>

using namespace std;

int CuttingRope(int n) {
    if (n == 2) {
        return 1;
    }
    if (n == 3) {
        return 2;
    }
    int result = 1;
    while (n > 4) {
        result *= 3;
        n -= 3;
    }
    result *= n;
    return result;
}

int main() {
    cout << CuttingRope(10);
    return 0;
}