import java.util.*;
public class D3Point extends D2Point
{
    double z;
    D3Point(double nx, double ny, double nz) //constructor 
    {
        super(nx,ny);
        z=nz;
    }
    double distance3d(D3Point b)//To return the distance between the point b and the current point in space
    {  
        return(Math.sqrt((Math.pow((this.x-b.x),2)) + (Math.pow((this.y-b.y),2)) + (Math.pow((this.z-b.z),2)))); 
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x coordinate of b:");
        double xb=sc.nextDouble(); //taking as input the x coordinate of b
        System.out.println("Enter the y coordinate of b:");
        double yb=sc.nextDouble(); //taking as input the y coordinate of b
        D2Point b=new D2Point(xb,yb);
        System.out.println("Enter the x coordinate of current point:");
        double x=sc.nextDouble(); //taking as input the x coordinate of current point 
        System.out.println("Enter the y coordinate of current point:");
        double y=sc.nextDouble(); //taking as input the y coordinate of current point 
        D2Point obj=new D2Point(x,y);
        System.out.println("Enter the z coordinate of b:");
        double zb=sc.nextDouble(); //taking as input the z coordinate of b
        D3Point ob=new D3Point(xb, yb, zb);
        System.out.println("Enter the z coordinate of current point:");
        double z=sc.nextDouble(); //taking as input the z coordinate of current point 
        D3Point ob1=new D3Point(x, y, z);
        System.out.println("The distance between the point b and the current point in the plane is: "+obj.distance2d(b));
        System.out.println("The distance between the point b and the current point in space is: "+ob1.distance3d(ob));
    }
}
/*Output:
Enter the x coordinate of b:
1
Enter the y coordinate of b:
4
Enter the x coordinate of current point:
2
Enter the y coordinate of current point:
5
Enter the z coordinate of b:
3
Enter the z coordinate of current point:
6
The distance between the point b and the current point in the plane is: 1.4142135623730951
The distance between the point b and the current point in space is: 3.3166247903554
 */