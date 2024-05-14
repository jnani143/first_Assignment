Algorithm:
 swaps the values of two integers using arithmetic operations without using a temporary variable. This approach is commonly known as the "Swap without temporary variable" technique. 
1. Input: Take two integers `a` and `b` as input.
2. Compute Sum and Difference:
   - Add `a` and `b` and store the result back in `a`. (Now, `a` holds the sum of the original `a` and `b`).
   - Subtract the original value of `b` from the updated `a` and store the result back in `b`. (Now, `b` holds the original value of `a`).
   - Subtract the original value of `b` from the updated `a` and store the result back in `a`. (Now, `a` holds the original value of `b`).
3. Return Pair of Swapped Values**: Return a pair containing the values of `a` and `b` after the swap.
This algorithm uses only arithmetic operations (addition and subtraction) to swap the values of `a` and `b` without using a temporary variable. It modifies the values of `a` and `b` in-place and returns them as a pair.

Code:
class Solution{   
    static List<Integer> get(int a,int b){
        //complete the function here
        a=a+b;
        b=a-b;
        a=a-b;
        return {a,b} ;
    }
};
