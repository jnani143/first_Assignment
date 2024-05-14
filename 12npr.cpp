class Solution{
public:
    long long nPr(int n, int r){
        // code here
        long int ans=1;
        for(int i=n;i>(n-r);i--)
            ans*=i;
        return ans;
    }
};
