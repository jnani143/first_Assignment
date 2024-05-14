
Better Solution:
class Solution{
    static String oddEven(int N){
        // code here
        if(N%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}
Optimal Solution :
Algorithm:
The oddEven method in your Java class determines whether a given integer N is odd or even using bitwise AND operation with 1. Here's the algorithm:
Input: Take an integer N as input.
Check Odd/Even:
Use the bitwise AND operation (&) between N and 1.
If the result is 0, then N is even because an even number's least significant bit is 0. Return "even".
Otherwise, if the result is 1, then N is odd because an odd number's least significant bit is 1. Return "odd".
Code:
class Solution{
    static String oddEven(int N){
        return (N&1)==0 ? "even" : "odd";
    }
}
