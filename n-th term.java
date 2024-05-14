
QUESTION:
        Find n-th term of series 1, 3, 6, 10, 15, 21
ALGORITHM:
        Algorithm findNthTerm(N):
        Input: N (the position of the term to find)
        Output: nthTerm (the value of the nth term)

         STEP-1. Initialize nthTerm to 0.
         STEP-2. Calculate nthTerm using the formula: nthTerm = N * (N + 1) / 2.
         STEP-3. Return nthTerm.
CODE:
    import java.util.Scanner;
    class Solution {
         static int findNthTerm(int N) {

                 return (N * (N + 1)) / 2;
         
      }
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int N = scanner.nextInt();

        System.out.println("The " + N + "-th term of the series is: " + findNthTerm(N));
      }

    }
