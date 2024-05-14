
#include<bits/stdc++.h> 
using namespace std; 

class Solution
{
public:
    int oppositeFaceOfDice(int N)
    {
        return 7-N;
    }
};
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        Solution ob;
        int ans  = ob.oppositeFaceOfDice(N);
        cout<<ans<<endl;
    }
    return 0;
}
