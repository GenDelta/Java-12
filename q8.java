/*Q8.Array union intersection with object passing (Question and practical done in the class.)*/
import java.util.*;
public class q8 
{
    int ar[];
    int n;
    static Scanner sc=new Scanner(System.in);
    q8(int cap) //constructor 
    {
        n=cap;
        ar=new int[n];
    }
    void input() //function to take as input the elements of the array 
    {
        for (int i=0;i<n;i++)
        {
          ar[i]=sc.nextInt();
        }
    }
    void display() //function to print the elements of the array 
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    q8 merge(q8 ob) //function to calculate union elements 
    {
        int i,j,f;
        q8 cm=new q8(ob.n+n);
        int k=0;
        for (i=0;i<ob.n;i++)
          cm.ar[k++]=ob.ar[i];
        for (i=0;i<n;i++)
        {
            f=0;
            for (j=0;j<k;j++)
            {
                if(ar[i]==cm.ar[j])
                {
                    f=1;break;
                }
            }
            if(f==0)
              cm.ar[k++]=ar[i]; 
        }
        cm.n=k;
        return cm;
    }
    q8 intersection(q8 ob) //function to calculate the intersection elements 
    { 
        q8 cm=new q8(Math.max(ob.n,n));
        int k=0;
        for (int i=0;i<ob.n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (ob.ar[i]==ar[j])
                {
                    cm.ar[k++]=ob.ar[i];
                    break;
                }
            }
        }
        cm.n=k;
        return cm;
    }
    public static void main()
    {
        int m,n;
        System.out.println("Enter the value of m");
        m=sc.nextInt(); //taking as input the value of m 
        q8 ob1=new q8(m);
        System.out.println("Enter elements of the 1st array:");
        ob1.input(); //taking as input the elements of the first array 
        System.out.println("Enter the value of n");
        n=sc.nextInt(); //taking as input the value of n 
        q8 ob2=new q8(n);
        System.out.println("Enter elements of the 2nd array:");
        ob2.input(); //taking as input the elements of the second array 
        System.out.println("1st array:");
        ob1.display(); //printing the first array
        System.out.println("2nd array:");
        ob2.display(); //printing the second array 
        q8 ob3=ob2.merge(ob1); //calculating the union elements 
        q8 ob4=ob2.intersection(ob1); //calculating the intersection elements 
        System.out.println("Union elements:");
        ob3.display(); //printing the union elements 
        System.out.println("Intersection elements:");
        ob4.display(); //printing the intersection elements 
    }
}
/*Output:
Enter the value of m
3
Enter elements of the 1st array:
1 2 3 
Enter the value of n
5 
Enter elements of the 2nd array:
2 3 4 5 6
1st array:
1 2 3 
2nd array:
2 3 4 5 6 
Union elements:
1 2 3 4 5 6 
Intersection elements:
2 3 
*/