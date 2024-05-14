
#include <bits/stdc++.h>
using namespace std;

class Solution{
public:	
	vector<float> streamAvg(int arr[], int n) {
	    // code here
	    int temp=0;
	    vector<float>ans;
	    for(int i=0;i<n;i++)
	    {
	        temp+=arr[i];
	        ans.push_back(static_cast<float>(temp)/(i+1));
	        
	    }
	    return ans;
	}
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.streamAvg(arr, n);
        cout << fixed<< setprecision(2);
        for (auto x : ans) {
            cout <<x<<" ";
        }
        cout << "\n";
    }
    return 0;
}
