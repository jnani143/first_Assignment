

#include <bits/stdc++.h>
using namespace std;


class Solution {
    private: long long int revNum(int N)
    {
        int rev=0;
        while(N!=0)
        {
            int rem=N%10;
            rev=rev*10+rem;
            N/=10;
        }
        return rev;
    }
  public:
    long long isSumPalindrome(long long n){

        for(int i=0;i<=5;i++)
        {
            if (n==revNum(n))
                return n;
            n+=revNum(n);
        }
        return -1;
        
    }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        long long n;
        cin >> n;
        Solution ob;
        cout<<ob.isSumPalindrome(n)<<endl;
    }
    return 0;
}
