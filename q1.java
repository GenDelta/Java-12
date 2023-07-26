/*
 * If the Ist day of the year is given Find out the months which are having Sunday as the Ist
day of the month
Input : Year 2019
Ist January:- Tuesday
Output:
Months having Ist day as Sunday : September,December
Input: Year 2016
Ist January:- Friday
Output:
Months having Ist day as Sunday : May
Input:2017
Ist January :Sunday:
Months having Ist day as Sunday : October
 */
import java.util.*;
public class q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int yr=sc.nextInt();//taking input of the year from user 
        System.out.println("Enter which day of the week January 1 falls on");
        String day=sc.next();//taking input of the day from user 
        day=day.toUpperCase();
        String []week={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        String[]months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if((yr%4==0 && yr%100!=0)||(yr%100==0 && yr%400==0))//checking if given year is a leap year 
        d[1]=29;
        int x=0;
        for(int i=0;i<week.length;i++)//calculating the position of the given day 
        {
            if(day.compareToIgnoreCase(week[i])==0)
            {
                x=i;
                break;
            }
        }
        int sum=0;
        System.out.println("The months beginning with a sunday are:");
        for(int i=0;i<12;i++) //printing the names of the months beginning with a sunday 
        {
            if((sum+x)%7==0)
            System.out.println(months[i]);
            sum+=d[i]%7;
            sum%=7;
        }
    }
}
        