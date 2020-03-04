#include <iostream>
#include <vector>

using namespace std;

int FindRepeatNumber(vector<int>& nums) {
    vector<int> count(nums.size());
    for (int num: nums) {
        count[num] += 1;
        if (count[num] > 1) {
            return num;
        }
    }
    return 0;
}

int main() {
    vector<int> nums = {2, 3, 1, 0, 2, 5, 3};
    cout << FindRepeatNumber(nums);
    return 0;
}