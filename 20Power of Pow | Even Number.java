
QUESTION:
      Power of Pow|Even Number. 

ALGORITHM:
   STEP-1. Start
   STEP-2. Read the number of test cases, T.
   STEP-3. Loop T times for each test case:
            Read the value of n.
            Calculate the sum of squares of even numbers up to n using the formula:
            sum=4×((𝑛×(𝑛+1)×(2𝑛+1))/6)
   STEP-4. Print the result, sum.
   STEP-5. End

CODE:
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.sum_of_square_evenNumbers(n);
            System.out.println(ans);
        }
    }
}

class Solution
{
     public double sum_of_square_evenNumbers(int n) {
        // Ensure the exponent is even
        return 4 * ((n * (n + 1) * (2 * n + 1)) / 6);
                     
     }    
    }
