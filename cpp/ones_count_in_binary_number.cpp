#include <iostream>

using namespace std;

int HammingWeight(uint32_t n) {
    int num_ones = 0;
    while (n) {
        num_ones += (n & 1);
        n = n >> 1;
    }
    return num_ones;
}

int main() {
    cout << HammingWeight(5);
    return 0;
}