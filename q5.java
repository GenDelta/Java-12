/*
 Q5. We'll say that a "triple" in a string is a char appearing three times in a row. Return the
number of triples in the given string. The triples may overlap.
countTriple("abcXXXabc") ? 1
countTriple("xxxabyyyycd") ? 3
countTriple("a") ? 0
Solve the problem with recursive way and non recursive way.
 */
import java.util.*;
public class q5
{
    public int countTriple(String s) //function to count triples via recursion 
    {
        if(s.length()<3)
          return 0;
        if(s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2))
          return (1+countTriple(s.substring(1)));
        else
          return countTriple(s.substring(1));
    }
    public int countTrip(String s) //function to count triples without recursion 
    {
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2))
            count++;
        }
        return count;
    }
    public static void main()
    {
        int rec,nrec;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string(without spaces):");
        String sent=sc.next(); //taking as input the string 
        q5 ob=new q5();
        rec=ob.countTriple(sent); //counting the number of triples via recursion 
        nrec=ob.countTrip(sent); //counting the number of triples without recursion 
        System.out.println("Number of triples in the sentence(via recursion) "+rec); //printing the number of triples counted with recursion
        System.out.println("Number of triples in the sentence(without recursion)= "+nrec); //printing the number of triples counted without recursion
    }
}
/*Output:
Enter a string(without spaces):
aaabbbcccddeihajhhhlllaaauisghhh
Number of triples in the sentence(via recursion) 7
Number of triples in the sentence(without recursion)= 7
 */