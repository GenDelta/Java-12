/*
Q16.
Accept n number of city names in an array. Sort them alphabeticaly by bubble sort method with
recursion. And an the sotrted array find a particular name by binary search (with reursion)
method.Display the position number in the arrya if it is found and display proper message if it is
not found.
*/
import java.util.*;
class q16
{
    static void sort(String a[], int n) //function to bubble sort the city names by recursion 
    {
        if (n==1)
            return;
        int c=0;
        for (int i=0;i<n-1;i++)
        { if (a[i].compareToIgnoreCase(a[i+1])>0)
            {
                String temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                c=c+1;
            }
        }
        if (c==0)
            return;
        sort(a,n-1);
    }
    int search(String a[], int last, int first, String s) //function to binary search a city name by recursion 
    {
        if (first>=last)
        {
            int mid=last+(first-last)/2;
            if (a[mid].compareToIgnoreCase(s)==0)
                return mid;
            if (a[mid].compareToIgnoreCase(s)>0)
                return search(a, last, mid - 1, s);
            return search(a, mid + 1, first, s);
        }
        return -1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt(); //taking the value of n as input 
        String a[]=new String[n];
        System.out.println("Enter "+n+" city names");
        for(int i=0;i<n;i++) //taking n no. of city names as input 
        {
            a[i]=sc.next()+sc.nextLine();
        }
        q16 ob=new q16();
        System.out.println("Sorted array:");
        ob.sort(a,n); //sorting the array by recursion 
        for(int i=0;i<n;i++) //printing the sorted array 
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the city to be searched: ");
        String c=sc.nextLine(); //taking as input the name of the city to be searched 
        int p=(ob.search(a,0,n-1,c))+1; //calculating the postion of the city which was searched for 
        if(p!=-1) //printing the position of the city which was searched for 
            System.out.println(c+" is present at position "+p+" of the given array."); 
        else
            System.out.println(c+" is not present in the given array.");
    }
}
/*Output:
Enter the value of n: 
5
Enter 5 city names
Kolkata
Mumbai
Delhi
Chennai
Bangalore
Sorted array:
Bangalore Chennai Delhi Kolkata Mumbai 
Enter the city to be searched: 
Kolkata
Kolkata is present at position 4 of the given array.
 */