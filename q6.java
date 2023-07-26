/*
Q6. Twins primes are consecutive prime numbers whose difference is 2. For example, (3,5),
(11,13), (17,19) are all twin primes. We define the distance of any twin prime pair from a positive
integer as follows. If (p1, p2) is a twin prime pair and n is a positive integer then the distance of
the twin prime from n is: minimum(abs(n-p1), abs(n-p2)) where abs returns the absolute value of
its argument, and minimum returns the smaller of its two arguments. Write a program that reads
in a positive integer n and prints out the twin prime pair that has the least distance from n. For
example if n is 30 the pair is (29,31), if n is 13 it is (11,13), if n is 49 it is (41,43). If n is 54 it is
(59,61).
Sample data: Input: Give the number : 34
Output: Number read in is : 34
Pl=29 p2=31
Input: Give the number : 60
Output: Number read in is 60 Pl=59 p2=61
 */
import java.util.*;
public class q6
{
    static boolean prime(int num) //function to check if a given number is a prime number
    {
        boolean isPrime=true;
        if(num<=1)
         return false;
        for(int i=2;i<=num/2;i++) 
        {
            if(num%i==0) 
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    static void result(int n,int p1, int p2) //function to print the values of p1 and p2
    {
        System.out.println("p1 = "+p1);
        System.out.println("p2= "+p2);
    }
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(); //taking as input the value of n 
        boolean res1=prime(n); //checking if n is a prime number 
        if(res1) //if n is a prime number, then checking if it has a twin prime and printing it 
        {
            boolean res2=prime(n - 2);
            if(res2) 
            {
                result(n,n-2,n);
                return;
            }
            boolean res3=prime(n+2);
            if(res3) 
            {
                result(n,n,n+2);
                return;
            }
        }
        if(prime(n-1) && prime(n+1)) //checking if adjacent numbers of n are twin primes and printing them 
        {
            result(n,n-1,n+1);
            return;
        }
        int l1=0,l2=0;
        for (int i=n-1;i>=5;i--) //checking for twin primes smaller than n 
        {
            if(prime(i)&& prime(i-2))
            {
                l1=i-2;
                l2=i;
                break;
            }
        }
        int r1=0,r2=0;
        for (int i=n+1;i<Integer.MAX_VALUE-2;i++) //checking for twin primes larger than n 
        {
            if(prime(i) && prime(i+2))
            {
                r1=i;
                r2=i+2;
                break;
            }
        }
        if(l1!=0 && l2!=0 && r1!=0 && r2!=0) //checking for the shorter distance of twin primes and printing it 
        {
            int lDist=Math.min(Math.abs(n - l1),Math.abs(n-l2));
            int rDist=Math.min(Math.abs(n-r1),Math.abs(n-r2));
            if(lDist<rDist)
                result(n,l1,l2);
            else
                result(n,r1,r2);
        }
        else if(l1!=0 && l2!=0) 
        {
            result(n,l1,l2);
        }
        else if(r1!=0 && r2!=0) 
        {
            result(n,r1,r2);
        }
    }
}
/*Output:
Enter a number
123
p1 = 137
p2= 139
 */