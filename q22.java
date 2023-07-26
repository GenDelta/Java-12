import java.util.*;
public class q22
{
    static Scanner sc=new Scanner(System.in);
    Citynames start,head;
    int len;
    char ch;
    void create(Citynames head) //function to create the list 
    {
        start=head; //sets the pointer to head
        System.out.println("Enter the no. of nodes initially:");
        len=sc.nextInt();
        for (int i=1;i<=len;i++) //for loop to take as input the city names
        {
            System.out.println("Enter the city name");
            String n=sc.next()+sc.nextLine();
            start.link=new Citynames(n,null); //sets the data of the next node to the user input n 
            start=start.link; //sets the pointer to next node
        } 
    }
    void accept() //function to accept the character to be searched
    {
        System.out.println("Enter the character to be searched for:");
        ch=sc.next().charAt(0); 
    }
    void disp(Citynames head) //function to display the list 
    {
        start=head.link; //sets the pointer to head
        while(start.link!=null) 
        {
            if(start.data.charAt(0)==ch) //if the first character of the node data is equal to the user input character, the data is printed
                System.out.println(start.data);
            start=start.link; //sets the pointer to next node
        }
        if(start.data.charAt(0)==ch) 
        System.out.println(start.data);
    }
    void main() 
    {
        head=new Citynames();
        create(head); 
        accept(); 
        disp(head); 
    }
}
/* Output:
Enter the no. of nodes initially:
7
Enter the city name
Kanpur
Enter the city name
Chennai
Enter the city name
Mumbai
Enter the city name
Kharagpur
Enter the city name
Bangalore
Enter the city name
Delhi
Enter the city name
Kanpur
Enter the character to be searched for:
K
Kanpur
Kharagpur
Kanpur
 */