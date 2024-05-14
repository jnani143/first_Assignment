
Your `getTable` method generates a list of multiples of a given number `N`. Here's the algorithm:
1. Input: Take an integer `N` as input.

2. Initialize an ArrayList**: Create an ArrayList to store the multiples of `N`.

3. Generate Multiples:
   - Iterate from `i = 1` to `i = 10` (inclusive).
   - For each iteration, calculate the multiple of `N` by multiplying `N` with `i`.
   - Add the result to the ArrayList.

4. Return the ArrayList: Return the ArrayList containing the multiples of `N`.

This algorithm generates multiples of `N` from 1 to 10 and stores them in an ArrayList, which is then returned.

Code:
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i = 1 ; i <= 10 ; i++){
            
         list.add(N * i);   
        }
        return list;
    }
}
