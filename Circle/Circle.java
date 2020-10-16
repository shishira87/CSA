 
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Circle
{
    // instance variables - replace the example below with your own
    private int radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int rad)
    {
        // initialise instance variables
        radius = rad;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public int getRadius(){
        return radius;
    }
    public double getArea(int rad)
    {
        // put your code here
        return Math.PI * rad * rad ;
    }
    public static void main(String[] args){
       Circle myCircle = new Circle(6);
       System.out.print("The area is " + myCircle.getArea(myCircle.getRadius()));
    }
}
