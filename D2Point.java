/*
 * A class D2Point defines the cordinates of a point in a plane while another class D3Point
defines the coordinates of a point in space.The details of both the classes are given
below:-
Class name D2Point
Data members double x,y to store x and y coordinates
Functions/Methods
D2Point(double nx,double ny) Constructor to assign nx to x and ny to y
double distance2d(D2Point b) To return the distance between the point b and

the current point in a plane

Class name D3Point
Data members Double z to store z coordinate
Functions/Methods
D3Point(double nz) Constructor to assign nz to z
double distance3d(D3Point b) To return the distance between the point b and

the current point in space

Define all the functions mentioned above along with void main() to execute above functions
after creating object of the inherited class.
 */

public class D2Point
{
    double x,y;
    D2Point(double nx, double ny) //constructor 
    {
        x=nx;
        y=ny;
    }
    double distance2d(D2Point b) //function to calculate distance between point b and the current point in a plane 
    {
        return(Math.sqrt((Math.pow((this.x-b.x),2))+Math.pow((this.y-b.y),2)));
    }
}

    

 