import java.util.*;
class info_olympic extends Olympic_2021
{
    String askname,type_of_medal;
    public void accept() //function to take as input which player to search for and their type of medal 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter required player's name and type of medal:");
        askname=sc.nextLine();
        type_of_medal=sc.nextLine();
    }
    public void display() //function to display the type of medal 
    {
        super.display(askname);
        System.out.println("Type of medal : "+type_of_medal);
    }
    public void main()
    {
        info_olympic ob=new info_olympic();
        ob.assign();
        ob.accept();
        ob.display();
    }
}
/*Enter name of player, field in which they participated, resident state, age and their performance in last 3 years in the order given :
Player 1:
aaa
shooting
wb
19
state level champion
Player 2:
zzz
javelin
chandigarh
21
national level champion
Player 3:
niroj
javelin
bangalore
22
commonwealth winner
Player 4:
sindhu
badminton
chennai
24
olympic winner
Player 5:
xyz
wtlifting
meghalaya
21
national level winner
Enter required player's name and type of medal:
niroj
gold
Name : niroj
Field : javelin
Resident state : bangalore
Age : 22
Information : commonwealth winner
Type of medal : gold
*/
