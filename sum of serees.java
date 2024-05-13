
class Solution {
    public static long seriesSum(int n) {
//sum to be long to hold even largee integers
        long sum=0;
//n1 to be taken to hold large values as n is limited to range of n so typecasted n to long and assigned to n1
        long n1=(long)n;
//as time complexity is 0(1) we have to compute this in 1 go so used below firmula
        sum=(n1*(n1+1))/2;
        
     
    return sum;
        
