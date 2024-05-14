/*Problem : Sum of Digit is Pallindrome or not
Algorithm: To check whether the digit sum of a number is a palindrome, here's a step-by-step algorithm:
1. **Input**: Take an integer number `n`.
2. **Calculate Digit Sum**:
   - Initialize a variable `sum` to 0.
   - Repeat the following steps while `n` is not 0:
     - Extract the last digit of `n` by taking `n % 10`.
     - Add this digit to `sum`.
     - Remove the last digit from `n` by doing integer division `n = n / 10`.
3. **Check Palindrome**:
   - Initialize a variable `reverseSum` to 0.
   - Copy the value of `sum` to a temporary variable `temp`.
   - Repeat the following steps while `sum` is greater than 0:
     - Extract the last digit of `sum` by taking `sum % 10`.
     - Add this digit to `reverseSum`.
     - Remove the last digit from `sum` by doing integer division `sum = sum / 10`.
   - If `reverseSum` is equal to `temp`, return true (indicating that the digit sum is a palindrome).
   - Otherwise, return false.
This algorithm first calculates the digit sum of the input number and then checks if this sum is a palindrome or not. It iterates through each digit of the sum to reverse it and compares the reversed sum with the original sum.

Code :*/
class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum  = 0, ans = 0;
        while(n!=0)
        {
            sum += n%10;
            n=n/10;
        }
        int temp = sum;
        while(sum > 0)
        {
            ans = ans*10+sum%10;
            sum/=10;
        }
        return temp==ans? 1:0;
    }
}
