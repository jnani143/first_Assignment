/*
Algorithm:
1) With sort function sort the elements of array
2) With length function find length of array and let it be n
3) if v has odd number of elements median 
will be middle element which is v[n/2]
4) if v has even number of elements then median is average of middle two elements,  which is (v[n-1/2)+v[n/2])/2
5)return median
6)Time complexity is O(n log n) as we have to sort array
7) Space complexity is O(1) as we have not used any additional space

Code:*/
class Solution
{
    public int find_median(int[] v)
    {
//sort functions sorts the array
      Arrays.sort(v);
//length function finds length of the array
      int n=v.length;
      int median;
      
 
        // if v has odd number of elements
        if (n % 2 != 0)
            median=v[n / 2];
        // if v has even number of elements
        else
            median=(v[(n-1)/2]+v[n/2])/2;
        return median;
    }
}
