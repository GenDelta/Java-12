/*
Q10. Smallest possible number Concatenate a sequence of numbers, so that the concatenated
number is as small as possible. For example, the sequence 12 872 9 122 would yield the
solution 121228729. The input consists of a line containing positive integral numbers separated
by a space. The output prints the smallest possible number that can be produced by
concatenating the entered numbers. The program terminates, as soon as the smallest number
is 0.

Input Output

12 872 9 122 121228729

1 12 112 111 111111212

0 0*/
import java.util.*;
public class q10
{
    public static void main()
    {
        int f=0;
        String s,s1="",t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers separated by a space. Enter 0 to terminate.");
        while(true)//calculating minimum value 
        {
            while(true)//checking if input is valid 
            {
              f=0;
              s=sc.next()+sc.nextLine();
              for(int i=0;i<s.length();i++)
              {
                  if(Character.isDigit(s.charAt(i))==false && s.charAt(i)!=' ')
                  {
                    f=1;
                    break;
                  }
              }
              if(f==0)
                break;
              System.out.println("Wrong input, please try again.");
            }
            if(s.compareTo("0")==0)
              break;
            StringTokenizer st=new StringTokenizer(s," ");
            String a[]=new String[st.countTokens()];
            for(int i=0;i<a.length;i++)//putting the inputs in an array by using StringTokenizer
              a[i]=st.nextToken();
            for(int i=0;i<a.length;i++) //sorting the array to have a minimum value 
            {
                for(int j=0;j<a.length-i-1;j++)
                {
                   if((a[j]+a[j+1]).compareTo(a[j+1]+a[j])>0)
                   {
                       t=a[j];
                       a[j]=a[j+1];
                       a[j+1]=t;
                   }
                }
            }
            for(int i=0;i<a.length;i++) //concatenating the values in array a to have a minimum number 
              s1+=a[i];
            System.out.println("Minimum number= "+s1);
            s="";
            s1="";
        }
    }
}
/*Output:
Enter the numbers separated by a space. Enter 0 to terminate.
2 32 123 
Minimum number= 123232
4 32 1 
Minimum number= 1324
0
 */