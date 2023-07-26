/*Given a string, the task is to encrypt this string using ! and @ symbols, alternatively.
While encrypting the message the encrypted format must repeat the symbol as many times as
the letter position in Alphabetical order.
Examples:
Input: string = "Ab"
Output: !@@
Explanation:
Position of 'A'; in alphabetical order is 1
and in String is odd position
so encrypted message will have 1 "!";
Position of 'b'; in alphabetical order is 2

and in String is even position
so encrypted message will have 2 '@'
Therefore, the output "!@@""
Input: string = "CDE"
Output: !!!@@@@!!!!!*/
import java.util.*;
public class q9
{
    public static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine(); //to take as input a string 
        String str1 = str.toUpperCase();
        char[] ch = str1.toCharArray();
        int len = str1.length();
        for(int i=0;i<len;i++)
        {
            if((i+1)%2==0)//to check if position is even and print @
            {
                for(int j=0;j<ch[i]-'A'+1;j++)//checking position in the alphabet and printing accordingly 
                {
                    System.out.print("@");
                }
            }
            else //if position in the string is odd then printing !
            {
                for(int j=0;j<ch[i]-'A'+1;j++)//checking position in the alphabet and printing accordingly 
                {
                    System.out.print("!");
                }
            }
        }
    }
}
/*Output:
Enter the string
ankush
!@@@@@@@@@@@@@@!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@!!!!!!!!!!!!!!!!!!!@@@@@@@@
*/