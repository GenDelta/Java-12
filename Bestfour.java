/*
Q13. A class Iscscores defines the scores of a candidate in six subjects and another class
defines the best four subjects.
The deatils of both the classes are given below:
Class name IScscores
Data members /Instance variable
int number[6][2[ To contain marks for six subjects and subject
code[numeric]

Member functions
Iscscores() Default constructor to accept the marks
int point() To return the point in each subject according to

the following:
Marks&gt;=90- 1 point
80-89 - 2 point
70-79 - 3 point
60-69 4 point

50-59 5 point
40- 49- 6 point

Class name Bestfour
void Besrsubjects() To display the total points ad best four subjects
code using the concept of inheritance
Specify both the classes along with void main() to implement the required job.
 */
import java.util.*;
class ISCscores
{
    Scanner sc=new Scanner(System.in);
    int number[][]=new int[6][2];
    ISCscores()//function to take as input subject code and marks 
    {
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter the subject code:");
            number[i][1]=sc.nextInt(); //taking subject code as input 
            System.out.println("Enter the marks for subject "+number[i][1]);
            while(true)
            {
              number[i][0]=sc.nextInt(); //taking marks as input 
              if(number[i][0]>0 && number[i][0]<=100) //checking if given marks are valid 
                break;
              System.out.println("Marks can not be less than 0 or more than 100, please give a proper input this time.");
            }
        }
    }
    int point(int m) //function to calculate the points depending on the marks 
    {   if(number[m][0]<40)
          return 7;
        return (10-number[m][0]/10);
    }
}
public class Bestfour extends ISCscores
{
    void Bestsubjects() //function to calculate the best four subjects and total points 
    {
        int temp,tot=0;
        for(int i=0;i<6;i++) //sorting the array to obtain the top 4 subjects 
        {
            for(int j=0;j<5-i;j++)
            {
                if(number[j][0]<number[j+1][0])
                {
                    temp=number[j+1][0];
                    number[j+1][0]=number[j][0];
                    number[j][0]=temp;
                    
                    temp=number[j+1][1];
                    number[j+1][1]=number[j][1];
                    number[j][1]=temp;
                }
            }
        }
        for(int i=0;i<6;i++) //calculating the total points 
            tot+=point(i);
        System.out.println("Total points: "+tot);
        System.out.println("The top 4 subjects are:");
        for(int i=0;i<4;i++)
            System.out.println("Subject "+number[i][1]);
    }
    public static void main()
    {
        Bestfour ob=new Bestfour();
        ob.Bestsubjects();
    }
}
/*Output:
Enter the subject code:
100
Enter the marks for subject 100
1023
Marks can not be less than 0 or more than 100, please give a proper input this time.
-99
Marks can not be less than 0 or more than 100, please give a proper input this time.
100
Enter the subject code:
101
Enter the marks for subject 101
78
Enter the subject code:
102
Enter the marks for subject 102
65
Enter the subject code:
103
Enter the marks for subject 103
98
Enter the subject code:
104
Enter the marks for subject 104
28
Enter the subject code:
105
Enter the marks for subject 105
43
Total points: 21
The top 4 subjects are:
Subject 100
Subject 103
Subject 101
Subject 102
 */