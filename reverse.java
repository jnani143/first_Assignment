/*
Algorithm
1) Take rev_num to hold reversed number and make it long to match n type
2)check each digit of n to add them to rev_num for that 
use while and check until n becomes<=0 which means no more digits to check
3)rev_num=rev_num*10 + n%10 => this is because each digit in n is added to rev_num supposed to be in correct place 
like tens, hundreads places should match in rev number 
eg: 15=>15%10 = 5 =>rev_num=5
1%10=1=>rev_num=5+1=6 but 5 should be in 10's place so 
50+1=51 reverse of 15
4)delete checked digit by n=n/10
5 return rev_num

Code:*/
class Solution
{
    public long reverse_digit(long n)
    {
    //to match type of n have taken rev_num as long
         long rev_num = 0; 
    //if n<=0 no more digits to check, while is checking only unchecked digits
        while (n > 0) { 
      //need to do rev_num*10 as prev rev_num no longer in units place 
            rev_num = rev_num * 10 + n % 10; 
            //to delete checked digit n= n/10
            n = n / 10; 
        } 
        return rev_num; 
    }
}
