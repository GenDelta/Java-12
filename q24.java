/*Q1. Create a link list having number of city names.Display the names starting with a
particulaur character accepted by user.*/
import java.util.*;
class node
{
    int data;node link;
    node() //constructor 
    {
        data=0;
        link=null;
    }
    node(int x,node ptr) //initializes the list 
    {
        data=x;
        link=ptr;
    }
}
public class q24
{
    int data;
    node link,start,head;
    Scanner sc=new Scanner(System.in);
    void main() //main method 
    {
        head=new node();
        create(head);
        disp(head);
        compute();
    }
    void create(node head) //function to create the list
    {
        start=head; //setting pointer to start of list 
        System.out.println("Enter the no. of nodes initially");
        int size=sc.nextInt(); //taking the size of the list as input
        for (int i=1;i<=size;i++)
        {
            System.out.println("Enter the numbers:");
            int no=sc.nextInt(); //taking the numbers as input
            start.link=new node(no,null); //setting the data of the next node to user input no
            start=start.link; //setting the pointer to the next node
        }
    }
    void disp(node head) //function to display the list
    {
        start=head.link; //setting the pointer to the 
        do 
        {
            System.out.println(start.data);
            start=start.link; //setting the pointer to the next node
        }
        while(start.link!=null);
        System.out.println(start.data);
    }
    void compute() //function to create new list of no.s divisible by 5 
    {
        node head1=new node(); 
        node start1=head1;
        start=head.link; //setting the pointer to start of list 
        do
        {
            if(start.data%5==0) //checking if the data in the node is divisible by 5 
            {
                start1.link=new node(start.data,null); //setting node data to start.data
                start1=start1.link;
            }
            start=start.link;
        }
        
        while(start.link!=null);
        if(start.data%5==0) //creating new list 
        {
            start1.link=new node(start.data,null);
        }
        System.out.println("The required new list is:");
        disp(head1); //displaying the required list 
    }
}
/*
Output:
Enter the no. of nodes initially
6
Enter the number
13 
Enter the number
10
Enter the number
25
Enter the number
7
Enter the number
9
Enter the number
100
13
10
25
7
9
100
The required new list is:
10
25
100
*/