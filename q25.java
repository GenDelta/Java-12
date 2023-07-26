/*
Create a link list having a number a of names. Search for a particular name . If it is
present delete the name and print the changed list.
 */
import java.util.*;
class node
{
    String data; node link;
    node()
    {
        data="";
        link=null;
    }
    node(String x, node ptr) //initializing the linked list
    {
        data=x;
        link=ptr;
    }
}
public class q25
{
    static node head,start;
    String s;
    int size;
    static Scanner sc=new Scanner(System.in);
    void create(node head) //function to create list
    {
        int i,n;String s;
        start=head; //setting the pointer to head 
        System.out.println("Enter the number of names");
        n=sc.nextInt(); //taking as input the no of names to be taken 
        System.out.println("Enter the names one by one");
        for(i=0;i<n;i++) //for loop to take as input the names
        {
            s=sc.next()+sc.nextLine();
            start.link=new node(s,null); //setting the data of the next node to user input s 
            start=start.link; //setting pointer to the next node
        }
    }
    void display() //function to diplay the list 
    {
        start=head.link; //setting the pointer to head
        while(start.link!=null)
        {
            System.out.print(start.data+" ");
            start=start.link; //setting the pointer to the next node
        }
        System.out.println(start.data);
    }
    void search(String s) //function to search 
    {
        start=head.link; //setting pointer to head
        node ptr=start;
        int flag=0;
        do
        {
          ptr=start;
          start=start.link;
          if(start.data.compareTo(s)==0) //checking if data in a node is equal to s
          {
            ptr.link=start.link; //setting ptr's node value to start's node value 
            flag=1;
            break;
            }
        }
        while(start.link!=null);
        if(flag==0) //checking if flag is equal to 0, meaning that the name has not been found in the list 
          System.out.println("Given name is not present in the list.");
    }
    public static void main() 
    {
        q25 ob=new q25();
        head=new node(); 
        ob.create(head);
        System.out.println("The initial list is:");
        ob.display(); 
        System.out.println("Enter the name to be deleted: ");
        String s=sc.next()+sc.nextLine(); 
        ob.search(s);
        System.out.println("The final list is:");
        ob.display(); 
    }
}
/* Output:
Enter the number of names
5
Enter the names one by one
Ankush
Daiwik 
Sourodeep 
Arshabrata 
Archisman 
The initial list is:
Ankush Daiwik  Sourodeep  Arshabrata  Archisman 
Enter the name to be deleted: 
Arshabrata 
The final list is:
Ankush Daiwik  Sourodeep  Archisman 
 */