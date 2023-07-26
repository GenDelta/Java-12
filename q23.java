/*
Ceate a link list having number of students’ name . Accept any student name(NAM)
along with a desired position. Insert NAM in the desired position and print the changed link
list.
 */
import java.util.*;
class node
{
    String data;node link;
    node()
    {
      data="";
      link=null;
    }
    node(String x, node ptr) //initializes the linked list 
    {
        data=x;
        link=ptr;
    }
}
public class q23
{
    static node start,head;
    static Scanner sc=new Scanner(System.in);
    void create(node head) //function to create the list
    {
        int i,n;String s;
        System.out.println("Enter the number of student names");
        n=sc.nextInt(); //taking no. of student names as input
        System.out.println("Enter the names one by one");
        start=head; 
        for(i=0;i<n;i++) //taking as input the names of 'n' students
        {
            s=sc.next()+sc.nextLine();
            start.link=new node(s,null); //stores the data given by user in next node
            start=start.link; //sets the pointer to next node
        }
    }
    void add(String NAM, int n) //function to insert another name
    {
        int count=0;
        start=head.link; //sets the pointer to the start of the list 
        node mid=new node(NAM,null); //creating a new node with String NAM as data
        node ptr=start; //setting ptr to start
        do
        {
            ptr=start;
            start=start.link;
            count++;
            if(count==n-1) //loop breaks when the position where the name is to be added is reached
              break;
        }
        while(start.link!=null);
        ptr.link=mid; //links mid in the desired position 
        mid.link=start; 
    }
    void display()
    {
        start=head.link; //sets the pointer to the start of the list
        System.out.println("The required list of names:");
        while(start.link!=null)
        {
            System.out.println(start.data);
            start=start.link;
        }
        System.out.println(start.data);
    }
    public static void main()
    {
        q23 ob=new q23(); //initializing object
        head=new node(); 
        ob.create(head); 
        System.out.println("Enter the name to be added");
        String NAM=sc.next()+sc.nextLine(); //takes as input the name to be added
        System.out.println("Enter the position in which name is to be added");
        int pos=sc.nextInt(); //takes as input the position where the name is intended to be added
        ob.add(NAM,pos); 
        ob.display(); 
    }
}
/* Output:
Enter the number of student names
5
Enter the names one by one
Ankush 
Sourodeep 
Daiwik 
Archisman 
Arshabrata 
Enter the name to be added
Agnivo 
Enter the position in which name is to be added
3
The required list of names:
Ankush 
Sourodeep 
Agnivo 
Daiwik 
Archisman 
Arshabrata 
 */