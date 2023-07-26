import java.util.*;
class Theatre_Stack
{ 
    int[] viewer_codes;
    int max_size;
    int first;
    int last;
    Theatre_Stack()//constructor 
    {
       max_size=1000;
       viewer_codes=new int[max_size];
       first=0;
       last=-1;
    }
    boolean checkStackIfEmpty() //function to check if stack is empty 
    {
       return last<first;
    }
    boolean checkStackIffull() //function to check if stack is full 
    {
       return last>=max_size-1;
    }
    void pushBuyTicket(int viewer_code) //function to add people to stack 
    {
       if(checkStackIffull())
       System.out.println("Stack is full");
       else
       {
           viewer_codes[++last]=viewer_code;
           System.out.println(viewer_code+" was added to the theatre stack");
        }
    }
   int popViewer() //function to remove people from stack 
   {
       if(checkStackIfEmpty())
       {
           System.out.println("Stack is empty");
           return -9999; 
       }
       else
       {
           return viewer_codes[last--];
       } 
    }
}
class Ticket_Queue
{
    int[] cons_code;
    int max_size;
    int front;
    int rear;
    Ticket_Queue() //constructor 
    {
        max_size=100;
        cons_code=new int[max_size];
        front=0;
        rear=-1;
    }
    boolean checkQueueIfEmpty() //function to check if queue is empty 
    {
        return front>rear;
    }
    boolean checkQueueIffull() //function to check is queue is full 
    {
        return rear>=max_size-1;
    }
    void pushViewer(int viewer_code) //function to add people to the queue 
    {
        if(checkQueueIffull())
        System.out.println("Queue is full");
        else
        {
            cons_code[++rear]=viewer_code;
            System.out.println(viewer_code+" was added to the queue.");
        }
    }
    int popViewer() //function to remove people from the queue 
    {
        if(checkQueueIfEmpty())
        {
            System.out.println("Queue is empty");
            return -9999;
        }
        else
        {
            return cons_code[front++];
        }
    }   
}
public class Theatre
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Theatre_Stack theatreStack=new Theatre_Stack();
        Ticket_Queue ticketQueue=new Ticket_Queue();
        outer:
        while(true)
        {
            System.out.println("Enter 1 to add person to ticketing queue and 2 to quit");
            int ch=sc.nextInt(); //taking user choice as input 
            switch(ch) //switch case statements to add person to queue or quit or display an error message is choice is wrong 
            {
                case 1:
                System.out.println("Enter viewer code");
                int code=sc.nextInt();
                ticketQueue.pushViewer(code);
                break;
                case 2:
                break outer;
                default:
                System.out.println("Wrong choice, try again");    
            }
        }
        while(!ticketQueue.checkQueueIfEmpty())
        {
            theatreStack.pushBuyTicket(ticketQueue.popViewer());   
        }
        System.out.println("Theatre stack:");
        int count=0;
        while(!theatreStack.checkStackIfEmpty())
        {
            System.out.println(theatreStack.popViewer());
            count++;
        }
        System.out.println("There were "+count+" viewers.");
    }
}
/*Output:
Enter 1 to add person to ticketing queue and 2 to quit
1
Enter viewer code
10
10 was added to the queue.
Enter 1 to add person to ticketing queue and 2 to quit
1
Enter viewer code
13
13 was added to the queue.
Enter 1 to add person to ticketing queue and 2 to quit
1
Enter viewer code
14
14 was added to the queue.
Enter 1 to add person to ticketing queue and 2 to quit
3
Wrong choice, try again
Enter 1 to add person to ticketing queue and 2 to quit
7
Wrong choice, try again
Enter 1 to add person to ticketing queue and 2 to quit
1
Enter viewer code
15
15 was added to the queue.
Enter 1 to add person to ticketing queue and 2 to quit
2
10 was added to the theatre stack
13 was added to the theatre stack
14 was added to the theatre stack
15 was added to the theatre stack
Theatre stack:
15
14
13
10
There were 4 viewers.
*/