#include <iostream>
#include <vector>

using namespace std;

vector<int> Exchange(vector<int>& nums) {
    int left = 0;
    int right = nums.size() - 1;
    while (left < right) {
        while (left < nums.size() && nums[left] % 2 == 1) {
            left += 1;
        }
        while (right >= 0 && nums[right] % 2 == 0) {
            right -= 1;
        }
        if (left < right && left < nums.size() && right >= 0) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left += 1;
            right -= 1;
        }
    }
    return nums;
}

int main() {
    vector<int> nums = {1, 11, 14};
    vector<int> result = Exchange(nums);
    for (int i: result) {
        cout << i << " ";
    }
    return 0;
}