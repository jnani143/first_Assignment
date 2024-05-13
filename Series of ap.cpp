/*
Probhlem: Series of Ap
Algorithm:
`nthTermOfAP` function appears to be designed to find the nth term of an arithmetic progression (AP). The function calculates the nth term using the formula for the nth term of an AP:

a_n = a_1 + (n - 1) * d

Where:
-  a_n  is the nth term,
-  a_1 is the first term,
-  n is the term number, and
-  d is the common difference between consecutive terms.
1.Calculate Common Difference d: Compute the common difference d between the first term a_1 and the second term a_2.

2.Calculate nth Term a_n: Use the formula a_n = a_1 + (n - 1) *d to find the nth term. Here, nis the given term number.

3.Return a_n: Return the computed nth term.

It takes the first term a_1, the second term a_2, and the term number n as input and returns the nth term of the AP.

Code:*/
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
        int d=a2-a1;
        int an=a1+(n-1)*d;
        return an;
    }
}
