QUESTION:
      Simple Interest 

INPUT:
   The first line of input contains an integer ( t ) (1<= t <=10^3 ), representing the number of test cases.
   Each of the following ( t ) lines contains three space-separated integers ( P  , R , and  T ) ( 1 <= P, R, T <= 10^4 ), representing the principal amount, rate of interest, and time period in years for each test case.

OUTPUT:
   For each test case, the code prints a single line containing the calculated simple interest with exactly two decimal places.

ALGORITHM:
STEP-1. Read the number of test cases (`t`):
   Read the first line of input, which contains a single integer `t`, representing the number of test cases.

STEP-2. For each test case:
   Read the next line of input, which contains three integers `P`, `R`, and `T`, separated by spaces.
    Create an instance of the `Solution` class.
    Call the `simpleInterest` method of the `Solution` class, passing the integers `P`, `R`, and `T` as arguments.
    Format the result to have two decimal places.
    Print the formatted result.

STEP-3. simpleInterest method:
    This method takes three integers (`P`, `R`, `T`) as arguments.
    Calculate simple interest using the formula: ( interest) = {P * R * T}/100.
    Return the calculated interest.

STEP-4. Repeat steps 2-3 for each test case until all test cases are processed.

STEP-5. Flush the output stream to ensure all data is written to the output.

CODE:
import java.io.*;
import java.util.*;

class Interest {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int P = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int T = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            out.println(String.format("%.2f",ob.simpleInterest(P, R, T)));
        }
        out.flush();
    }
}

class Solution {
    double simpleInterest(int P, int R, int T) {
                
        double interest = (P * R * T) / 100.0;
        
        return interest;
    }
}
