Method 1:
class Solution{
    static int addition(int A, int B){
        // code here
        return A+B;
    }
}
Method 2:using bits manipulation
1) Calculate the carry by performing bitwise AND
2) Calculate the sum without considering carry by performing bitwise XOR
3) Left-shift the carry to add to the next bit position
class Solution{
    static int addition(int a, int b){
        // code here
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;         
            b = carry << 1;   
        }
        return a;
    }
}
