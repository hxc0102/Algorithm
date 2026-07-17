#include <iostream>
#include <string>

using namespace std;

int main(void) {
    string str;
    cin >> str;
    if( 1<= str.length() <= 1000000)
        cout << str;
}