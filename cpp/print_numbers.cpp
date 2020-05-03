#include <iostream>
#include <vector>
#include <math.h>

using namespace std;

vector<int> PrintNumbers(int n) {
    int max_num = 0;
    for (int i = 0; i < n; i++) {
        max_num += 9 * pow(10, i);
    }
    vector<int> result(max_num);
    for (int i = 0; i < max_num; i++) {
        result[i] = i + 1;
    }
    return result;
}

int main() {
    vector<int> result = PrintNumbers(1);
    for (int i: result) {
        cout << i << " ";
    }
    return 0;
}