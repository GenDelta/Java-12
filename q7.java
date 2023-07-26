/*
Q7. Accept MX8 as dimensions of a 2dimensional array. Fill up the array with the binary
conversion of M no. Of decimal number .Print the column nos. Which are having maximum
number of 1s in it.
If the converted binary number is not comprising of 8 bits eg for 8 it is 1000
fill it up with 00001000
 */
import java.util.*;
public class q7
{
    static long bin(int dec) //function to convert decimal to binary 
    {
        if(dec==0)
        return 0;
        else 
        return(dec%2+10*bin(dec/2));
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of M");   
        int M=sc.nextInt(); //taking as input the value of M 
        char a[][]= new char[M][8];
        System.out.println("Enter the decimal numbers:");
        int n=0; 
        String num[]=new String[M];
        for(int i=0;i<M;i++) //taking as input decimal values and converting them to 8 bit binary values 
        {
            n=sc.nextInt();
            long c=bin(n);
            num[i]=Long.toString(c);
            int e=num[i].length(); 
            if(e!=8)
            for(int j=0;j<8-e;j++)
              num[i]="0"+num[i]; 
        }
        System.out.println("The binary converted array is:");
        for(int i=0;i<M;i++) //printing the binary converted values 
        {
            for(int j=0;j<8;j++)
            {
                a[i][j]=num[i].charAt(j);
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int c=0;
        int k=0; 
        for(int i=0;i<8;i++) //calculating the number of 1's in each column 
        {
            for(int j=0;j<M;j++)
            if(a[j][i]=='1')
            c++;
            if(k<c) 
            k=c; 
            c=0;
        }
        System.out.println("The columns with highest number of 1's are: ");
        for(int i=0;i<8;i++) //printing the position of the column with highest number of 1's 
        {
            for(int j=0;j<M;j++)
            if(a[j][i]=='1')
            c++;
            if(c==k)
            System.out.println((i+1));
            c=0;
        }
    }
}
/*
Enter the value of M
5
Enter the decimal numbers:
17 18 19 20 21
The binary converted array is:
00010001
00010010
00010011
00010100
00010101
The columns with highest number of 1's are: 
4
 */    
    

    