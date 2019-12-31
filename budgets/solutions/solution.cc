#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    double se, sr, rr, re;
    cin >> sr;
    cin >> se;
    cin >> rr;
    cin >> re;
    rr += 1;
    re += 1;
    
    int count = 0;
    while (sr < se) {
        sr *= rr;
        se *= re;
        ++count;
    }
    cout << count;
    return 0;
}
