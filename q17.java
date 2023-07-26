/*
Q17. 
Given a time in numbers we can convert it into words. For example:- 5:00 five o’clock 5:10 ten minutes past five 5:15 quarter past five 5:30 half past five 5:40 twenty minutes to six 5:45 quarter to six 5:47 thirteen minutes to six Write a program which first inputs two integers, the first between 1 and 12 (both inclusive) and second between 0 and 59(both inclusive) and then prints out the time they represent, in words. Your program should follow the format of the example below:-

SAMPLE  DATA :
INPUT :
TIME  : 3:0
OUTPUT : 3:00 Three O’clock
INPUT :
TIME : 7:29
OUTPUT : 7:29 Twenty Nine Minutes Past Seven
INPUT : TIME : 6:34
OUTPUT : 6:34 Twenty Six Minutes To Seven

 */
import java.util.*;
class q17
{
    static void Words(int hr, int min) //function to covert given time to words 
    {
        String time[] = { "zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen", 
            "fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five", 
            "twenty six","twenty seven","twenty eight","twenty nine"};
        if (min == 0)
            System.out.println(time[hr]+" o' clock ");
        else if (min == 1)
            System.out.println("one minute past "+time[hr]);
        else if (min == 15)
            System.out.println("quarter past " + time[hr]);
        else if (min < 30)
            System.out.println(time[min]+" minutes past "+time[hr]);
        else if (min == 30)
            System.out.println("half past "+time[hr]);
        else if (min > 30)
            System.out.println(time[60-min] +" minutes to "+time[(hr%12)+1]);
        else if (min == 45)
            System.out.println("quarter to "+time[(hr%12)+1]);
        else if (min == 59)
            System.out.println("one minute to "+time[(hr%12)+1]);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int hr,min;
        System.out.println("Enter the time in hour and mn :");
        while(true) //taking a valid time in hh:mm format as input 
        {
            hr=sc.nextInt();
            min=sc.nextInt();
            if(hr>=1 && hr<=12 && min>=0 && min<=59)
            break;
            else
            System.out.println("Invalid time, please give input again:");
        }
        Words(hr,min); //converting and printing the time in words
    }
}
/*Output:
Enter the time in hh:mm format:
27 90 
Invalid time, please give input again:
7 90 
Invalid time, please give input again:
13 12 
Invalid time, please give input again:
-1 61 
Invalid time, please give input again:
13 -1 
Invalid time, please give input again:
6 30 
half past six
*/