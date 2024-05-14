
QUESTION:
     Greatest of Three Numbers
    
INPUT:
    The first line of input contains an integer t (1 ≤ t ≤ 1000), representing the number of test cases.
    Each of the following t lines contains three space-separated integers A, B, and C (-10^3 ≤ A, B, C ≤ 10^3), representing the three numbers for each test case.

OUTPUT:
    For each test case, the code prints a single integer, representing the greatest of the three numbers A, B, and C.

ALGORITHM:
STEP-1.Read the number of test cases (t):

STEP-2.Read the first line of input, which contains a single integer t, representing the number of test cases.
For each test case:
Read the next line of input, which contains three integers A, B, and C, separated by spaces.
Create an instance of the Solution class.
Call the greatestOfThree method of the Solution class, passing the integers A, B, and C as arguments.
Print the result returned by the greatestOfThree method.

STEP-3:greatestOfThree method:
This method takes three integers (A, B, C) as arguments.
Initialize a variable greatest with the value of A.
Compare B with greatest:
If B is greater than greatest, update greatest to B.
Compare C with greatest:
If C is greater than greatest, update greatest to C.
Return the value of greatest.
Repeat the above steps for each test case until all test cases are processed.

CODE:
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.greatestOfThree(A, B, C));
        }
    }
}


class Solution {
    int greatestOfThree(int A, int B, int C) {
        int greatest = A;

        if (B > greatest) {
            greatest = B;
        }

        if (C > greatest) {
            greatest = C;
        }

        return greatest;
    }
}
