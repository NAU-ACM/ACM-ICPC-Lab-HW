#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int GCD(int a, int b) {
    return b == 0 ? a : GCD(b,a%b); 
}

int binary (int a[], int l, int r) {
    if (r-l == 1) 
        return a[l];
    
    int p1 = binary (a,l,(l+r)/2);
    int p2 = binary (a,(l+r)/2,r);
    return GCD (p1,p2);
}

int main() {
    int t,n,i,j;
    int a[101],x;
    
    cin >> t;
    while (t-- > 0) {
        cin >> n;
        for (int i=0; i < n; i++)
            cin >> a[i];

        if (binary (a,0,n) == 1)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    
    
    return 0;
}