#include <iostream>
#include <regex>

using namespace std;

bool IsNumber(string s) {
    // 这道题c++的版本就是跑不通。。算了
    if (s.empty()) {
        return false;
    }
    return regex_match(s, regex("[-+]?(?:[0-9]+\\.?|\\.[0-9]+)[0-9]*(?:e[-+]?[0-9]+)?"));
}

int main() {
    cout << IsNumber("+100.0");
    return 0;
}