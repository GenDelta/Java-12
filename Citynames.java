/*
Create a link list having number of city names.Display the names starting with a
particulaur character accepted by user.
 */
import java.util.*;
public class Citynames
{
    String data;
    Citynames link;
    Citynames()
    {
        data="";
        link=null;
    }
    Citynames(String x,Citynames ptr) //Initializes the linked list
    {
        data=x;
        link=ptr;
    }
}