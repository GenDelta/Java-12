/*
Q14
A class Olympic-2021 is defined with following data members. Player array contains at least 5
players’ name and other arrays are having his/her corresponding information in the same
sequence.
info_Olympic is n inherited class from Olympic _2021
Class name Olympic_2021
Data member

String player[] Array Contains the name of the players
participated in individual item in 2021 olympic
String item[] Array contains the item in which the players

participated

String state[] Resident state of the players
int age[] Age of the players
String info[] His /her performance in last 3 years.
Meber function
void assign() Assignment of specific information of 5 players’
in 5 different arrays mainintaing the sequence.
void display(String reqdname) Display the information of the player whose

name is accepted in reqdname

Class info_olympic
Data member
String askname String to store the required player’s name
Type_of_medal String to store the type of medal
void accept() To accept the required player’s name and

Type_of_medal

void display(() Display all formation regaring askname
accesing the base class and also display
Type_of_medal
*/
import java.util.*;
class Olympic_2021
{
    String player[],item[],state[],info[];
    int age[];
    public void assign() //function to take as input the name of the player, item, state and age 
    {
        Scanner sc=new Scanner(System.in);
        player=new String[5];
        item=new String[5];
        state=new String[5];
        info=new String[5];
        age=new int[5];
        System.out.println("Enter name of player, field in which they participated, resident state, age and their performance in last 3 years in the order given :");
        for(int i=0;i<5;i++)
        {
            System.out.println("Player "+(i+1)+":");
            player[i]=sc.next()+sc.nextLine();
            item[i]=sc.next()+sc.nextLine();
            state[i]=sc.next()+sc.nextLine();
            age[i]=sc.nextInt();
            info[i]=sc.next()+sc.nextLine();
        }
    }
    public void display(String reqdname)  //function to display the information which was taken as input after searching 
    {
        int f=0;
        for(int i=0;i<5;i++)
        {
            if(player[i].equalsIgnoreCase(reqdname))
            {
                System.out.println("Name : "+player[i]);
                System.out.println("Field : "+item[i]);
                System.out.println("Resident state : "+state[i]);
                System.out.println("Age : "+age[i]);
                System.out.println("Information : "+info[i]);
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("Name not found!");
    }
}
        