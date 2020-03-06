#include <iostream>

using namespace std;

string ReplaceSpace(string s) {
    while (s.find(" ") != string::npos) {
        int start = s.find(" ");
        s.replace(start, 1, "%20");
    }
    return s;
}

int main() {
    cout << ReplaceSpace("We are happy.");
    return 0;
}