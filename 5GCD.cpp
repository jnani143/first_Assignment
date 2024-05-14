
class Solution {
  public:
    int gcd(int a, int b) {
        while(b!=0)
          {
              int k=b;
              b=a%b;
              a=k;
              
          }
          return a;
        
    }
};
