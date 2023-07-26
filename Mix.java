/*Q11.
A class Mix has been defined to mix two words ,character by vharacter in the following manner:
The first character of the first word is followed by the first character of the second word and so
on. If the word are of different length ,the remaining character of the longer word are put at the
end.
Cif the first word is “JUMP” and the second word is “STROLL” then thne required word will be
“JSUTMRPOLL”
Some of the members of the class are given below:-

Class name Mix
Data members
wrd To store a word
len To store the length of the word
Member functions/methods
Mix() Default constructor to initialize the data
members with legal initiaal values
void feedword() To accept the word in uppercase
void mix_word(Mix P,Mix Q) Mixes the words of the object P and Object Q
as stted above and stores the resultant
word in the current object
Void display() Displays the word
Specfy the class Mix by defining all the functions mentioned above. Define main()
to create objects and execute all the functions to enable the task.
*/
import java.util.*;
public class Mix
{
    String wrd;
    int len;
    Mix()//constructor 
    {
        wrd="";
        len=0;
    }
    void feedword()//function to take input in upper case 
    {
        Scanner sc=new Scanner(System.in);
        wrd=sc.next().toUpperCase();
        len=wrd.length();
    }
    void mix_word(Mix P, Mix Q) //function to mix the words in given order
    {
        String s="";
        for(int i=0;i<P.len || i<Q.len;i++)
        {
            if(i<P.len)
            s+=P.wrd.charAt(i);
            if(i<Q.len)
            s+=Q.wrd.charAt(i);
        }
        this.wrd=s;
    }
    void display() //function to display the mixed word 
    {
        System.out.println("The combined word is "+this.wrd);
    }
    public static void main()
    {
        Mix P=new Mix();
        Mix Q=new Mix();
        Mix obj=new Mix();
        System.out.println("Enter the first word:");
        P.feedword(); //taking the first word as input
        System.out.println("Enter the second word:");
        Q.feedword(); //taking the second word as input
        obj.mix_word(P, Q);
        obj.display();
    }
}
/*Output:
Enter the first word:
INDEPENDENCE 
Enter the second word:
DAY
The combined word is IDNADYEPENDENCE   

Enter the first word:
independence
Enter the second word:
day
The combined word is IDNADYEPENDENCE
*/
 