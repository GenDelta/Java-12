/*
Q2. Write a program to declare a single dimensional array a[] and a square matrix b[][] of size N
where  N>2 &N<10 .Allow the user to input positive integer only into the single
dimensional array. Perform the following tasks.
a.Sort the elements of the one dimensional array in ascending order using any sorting technique .  display the sorted array.
b. Fill the array b[][] in the following format   if the array a[]={5,2,8,1} then after sorting it
becomes a[]={1,2,5,8}
Then the matrix b[][] will be filled as below:
1 2 5 8
1 2 5 1
1 2 1 2
1 1 2 5
 */
import java.util.*;
class q2
{
    public static void main()
    {
        int i,j,k,N,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        while(true) //taking as input the valid value of N from the user 
        {   N=sc.nextInt();
            if(N>2&&N<10)
                break;
            else
                System.out.println("Wrong input, enter the value of N again.\n It must be >2 and <10");
        }
        int a[]=new int[N];
        int b[][]=new int[N][N];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<N;i++) //taking as input the elements of the array 
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<N-1;i++) //sorting the array 
        {
            for(j=0;j<N-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.print("The sorted array is: ");
        for(i=0;i<N;i++) //printing the sorted array 
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int x=0;
        for(i=0;i<N;i++) //filling the matrix b in the given order 
        {
            for(j=0;j<N-x;j++)
            {
                b[i][j]=a[j];
            }
            for(k=0;k<x;k++)
            {
                b[i][N-x+k]=a[k];
            }
            x++;
        }
        System.out.println("The filled matrix b is:");
        for(i=0;i<N;i++) //printing the filled matrix 
        {
            for(j=0;j<N;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*Ourput:
Enter the value of N
1
Wrong input, enter the value of N again.
 It must be >2 and <10
30
Wrong input, enter the value of N again.
 It must be >2 and <10
4
Enter the elements of the array:
6 7 43 8
The sorted array is: 6 7 8 43 
The filled matrix b is:
6 7 8 43 
6 7 8 6 
6 7 6 7 
6 6 7 8 
 */