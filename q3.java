/*
 * Q3. Given an arrayA[]of integers,sort the array according to frequency of elements.
That is , elements that have higher frequency come first.
If frequencies of two elements are the same, then a smaller number comes first.
5 5 4 6 4
4 4 5 5 6*/
import java.util.*;
public class q3
{
    public static void main()
    {
        int n,t,g=0,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt(); //taking as input the value of n 
        int A[]=new int[n];
        int b[]=new int[n];
        int c[][]=new int[n][2];
        System.out.println("Enter the elements of the array"); 
        for(int i=0;i<n;i++) //taking as input the elements of the array 
        {
            A[i]=sc.nextInt();
        }        
        System.out.println();
        for(int i=0;i<n;i++) //calculating the frequency of the given numbers 
        {
            g=0;f=0;
            for(int j=0;j<n;j++)
            {
              if(A[i]==c[j][0])
                g=1;
            }
            if(g==1)
              continue;
              for(int j=0;j<n;j++)
              {
              if(A[i]==A[j])
                f++;
            }
            c[i][0]=A[i];
            c[i][1]=f;
        }
        for(int i=0;i<n;i++) //arranging the numbers in decreasing order of their frequency 
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(c[j][1]<c[j+1][1])
                {
                    t=c[j][1];
                    c[j][1]=c[j+1][1];
                    c[j+1][1]=t;
                    t=c[j][0];
                    c[j][0]=c[j+1][0];
                    c[j+1][0]=t;
                }
                else if(c[j][1]==c[j+1][1]) //if the frequencies of two numbers are equal, arranging them in incresing order of their value 
                {
                    if(c[j][0]>c[j+1][0])
                    {
                        t=c[j][1];
                        c[j][1]=c[j+1][1];
                        c[j+1][1]=t;
                        t=c[j][0];
                        c[j][0]=c[j+1][0];
                        c[j+1][0]=t;
                    }
                }
            }
        }
        g=0;
        for(int i=0;i<n;i++) //converting from 2d array to 1d array i.e. from numbers with their frequencies to just the numbers 
        {
            if(c[i][1]==0)
             break;
            for(int j=g;j<g+c[i][1];j++)
              b[j]=c[i][0];
            g+=c[i][1];
        }
        for(int i=0;i<n;i++) //printing the final arranged array 
        {
            System.out.print(b[i]+" ");
        }
    }
}
/*Output:
Enter the value of n
10
Enter the elements of the array
1 1 5 5 5 5 8 8 8 2 

5 5 5 5 8 8 8 1 1 2 
*/