/*Find the elements which are occurring more than once .Remove the Ist occurrence of each
item.
Input: No.of elements in the array:-7
Enter the elements:5 2 3 4 5 2 6
Output Initial content of the array 5 2 3 4 5 2 6
Final content of the array:- 3 4 5 2 6 */
import java.util.*;
public class q4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt(); // taking as input the value of n 
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) //taking as input the elements of the array 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Initial content of the array");
        for(int i=0;i<n;i++) //printing the original array 
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++) //removing the first occurence of each item 
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=0;
                }
            }
        }
        System.out.println();
        System.out.println("Final content of the array");
        for(int i=0;i<n;i++) //printing the final array 
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
/*Output:
Enter the number of elements in the array
10
Enter the elements
1 1 2 2 2 73 73 6 6 7
Initial content of the array
1 1 2 2 2 73 73 6 6 7 
Final content of the array
1 2 73 6 7 
*/