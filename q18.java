/*
Q18.
In this problem you need to determine the largest alphabetized substring. Given a string
of characters, determine which contiguous group of characters has the largest number
of characters that are in ascending alphabetical order. For example, given the string
“adfjabcghl” the largest substring in alphabetical order is abcghl. 
Every string will have at least one alphabetized substring. Display the first substring if
the string has more than one substring of the same length. 
Input
Prompt for and read a list of lower-case letters. No spaces, numbers, or special
characters will be entered. There will always be at least one character entered. There is
no upper limit to how many characters can be entered. Read the data from the console. 

Output:
Output
The characters in the largest substring. Display the output on the monitor. See the
sample output below. 

Input Output
Enter a string
adfjabcghl Longest substring in alphabetical order is abcghl
Enter a string
dghmbkaluc Longest substring in alphabetical order is dghm
Enter a string
kldcfazdgsuzgkqc Longest substring in alphabetical order is dgsuz
Enter a string
egikmoq Longest substring in alphabetical order is egikmoq
Enter a string
g Longest substring in alphabetical order is g
Enter a string 
fc Longest substring in alphabetical order is f
 */
import java.util.*;
public class q18
{
    public static void main()
    {
        int ml=0;
        String s1="",max="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next().toLowerCase(); //taking a string as input 
        int l=s.length() ;
        for(int i=0;i<l;i++) //finding the longest part of the string which is in alphabetical order 
        {
            s1+=s.charAt(i);
            for(int j=i;j<l-1;j++)
            {
                if(s.charAt(j+1)>s.charAt(j))
                  s1+=s.charAt(j+1);
                else
                  break;
            }
            if(s1.length()>ml)
            {
                max=s1;
                ml=s1.length();
            }
            s1="";
        }
        System.out.println("Longest string in alphabetical order is "+max); //printing the longest part of the string which is in alphabetical order
    }
}
/*Output:
Enter a string: 
whgashghjasgdhjgsajdguytgjsagjudhabcdefgjshdjkshjkhashjkdh
Longest string in alphabetical order is abcdefgjs
 */