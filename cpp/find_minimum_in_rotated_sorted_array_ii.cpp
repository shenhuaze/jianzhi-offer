#include <iostream>
#include <vector>

using namespace std;

int MinArray(vector<int>& numbers) {
    int min = numbers[0];
    for (int num: numbers) {
        if (num < min) {
            min = num;
        }
    }
    return min;
}

int MinArray1(vector<int>& numbers) {
    int start = 0;
    int end = numbers.size() - 1;
    while (start + 1 < end) {
        int mid = start + (end - start) / 2;
        if (numbers[mid] < numbers[end]) {
            end = mid;
        } else if (numbers[mid] > numbers[end]) {
            start = mid;
        } else {
            end -= 1;
        }
    }
    return min(numbers[start], numbers[end]);
}

int main() {
    vector<int> numbers = {2, 2, 2, 0, 1};
    cout << MinArray1(numbers);
    return 0;
}