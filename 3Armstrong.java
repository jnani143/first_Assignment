
//Problem: Armstrong Numbers
//Algorithm: To determine whether the given number is Armstrong number is not
/*1.Start.
2.Define a class named Solution.
3.Inside the class Solution, define a static method named armstrongNumber that takes an integer n as input and returns a string representing whether n is an Armstrong number ("Yes" if true, "No" if false).
4.Initialize two integer variables, r and sum, to store the remainder and the sum of cubes of digits, respectively.
5.Copy the value of n to another variable s to preserve the original number.
6.While n is greater than 0:
 a. Calculate the remainder of n when divided by 10 and store it in r.
 b. Add the cube of r to the sum.
 c. Divide n by 10.
7.After the loop, check if sum is equal to the original number s:
8.If true, return "Yes".
9.If false, return "No".
10.End.*/
Code:
class Solution {
    static String armstrongNumber(int n){
        // code here
      int r,sum=0;
      int s=n;
      while(n>0){
      r=n%10;
      sum+=Math.pow(r,3);
      n=n/10;
      }
      if(sum==s)
      {
          return "Yes";
      }
      else
      {
          return "No";
      }
    }
}
