/*
Q20.
Numbers have different representations depending on the bases on which they are expressed. For example
in base 3, the number 12 is written as 110 (1 x 32 + 1 x 31 + 0 x 30), but in base 8 it is written as 14(1 x 81 + 4 x
80).
Consider, for example, the integers 12 and 5. Certainly these are not equal if base 10 is used for each. But
suppose 12 was a base 3 number and 5 was a base 6 number then what happens, 12 base 3 = 1 x 31 + 2 x 30,
or 5 base 6 or 5 base 10 (5 in any base is equal to 5 base 10). So 12 and 5 can be equal if you select the right
bases for each of them.
Write a program to input two integers, X and Y, and calculate the smallest base for X and smallest base for Y
(likely different from X) so that X and Y represent the same value. The base associated with X and Y will be
between 1 and 20 (both inclusive). In representing these numbers the digits 0 to 9 have their usual decimal
interpretations. The upper case alphabetic characters A through J represent digits 10 through 19
respectively.
Test your program for the following data and some random data:
SAMPLE DATA:
INPUT:
X = 12, Y = 5
OUTPUT:
12(base 3) = 5 (base 6)

INPUT:
X = 10, Y = A
OUTPUT:10 (base 10) = A (base 11)
 
INPUT:
X = 12, Y = 34
OUTPUT:
12 (base 17) = 34 (base 5)
 
INPUT:
X = 123, Y = 456
OUTPUT:
1 2 3 is not equal to 456 in any base between 2 to 20
 
INPUT:
X = 42, Y = 36
OUTPUT:
42 (base 7) = 36 (base 8)
 */
import java.util.*;
public class q20
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X:");
        String X=sc.nextLine(); //taking the value of X as input 
        System.out.println("Enter the value of Y:");
        String Y=sc.nextLine(); //taking the value of Y as input 
        int max_x=getHighestDigit(X);
        int max_y=getHighestDigit(Y);
        boolean f=false;
        int decar[] = new int[20];
        for(int i=max_x;i<20;i++) 
        {
            decar[i] = todec(X,i+1);
        }
        for(int i=max_y;i<20;i++) 
        {
            int t=todec(Y,i+1);
            for(int j=max_x;j<20;j++) 
            {
                if(t==decar[j]) //printing the values in equal bases 
                {
                    f=true;
                    System.out.println(X+" in base "+(j+1)+" is equal to "+Y+" in base "+(i+1));
                    break;
                }
            }
            
            if(f) 
            {
                break;
            }
        }
        if(!f) //if the values are not equal in any base between 2 and 20, printing the same 
        {
            System.out.println(X+" is not equal to "+Y+" in any base between 2 to 20");
        }
    }
    public static int todec(String s, int base) //function to calculate the values of a given number in a certain base 
    {
        int num=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            int m=(int)Math.pow(base,(l-i-1));
            char ch=s.charAt(i);
            int d=digitValue(ch);
            num=num+d*m;
        }
        return num;
    }
    public static int digitValue(char c) //function to calculate the value of a character type data 
    {
        int v=0;   
        if(Character.isDigit(c)) 
        {
            v=c-'0';
        }
        else if(Character.isLetter(c)&&c>='A'&&c<='J') 
        {
            v=c-'A'+10;
        }
        return v;
    }
    public static int getHighestDigit(String s)//function to calculate the highest digit 
    {
        int h=0;
        int l=s.length();   
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            int d=digitValue(ch);
            if(d>h) 
            {
                h=d;
            }
        }
        return h;
    }   
}
/*
 * Enter x:
45
Enter y:
76
45 in base 16 is equal to 76 in base 9
 */