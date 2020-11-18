
/**
 * Return BMI score
 *
 * @author Shishir Sudhaman
 * @version 11.17.2020
 */
import java.util.Scanner;
public class BMI
{
    // instance variables - replace the example below with your own
    private double weight;
    private double height;
    Scanner sc = new Scanner(System.in);

    /**
     * Constructor for objects of class BMI
     */
 
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private static double calculateBMI()
    {
       // put your code here
      Scanner sc = new Scanner(System.in);
      System.out.println("Weight (in pounds): ");
      double weight = sc.nextDouble();
      System.out.println("Height (in inches): ");
      double height = sc.nextDouble();
      double value = ((weight/Math.pow(height,2)) * 703);
      System.out.println(value);
      return value;
    }
    public static void weightClass()
    {
       double value = calculateBMI();
       System.out.println("BMI: "+ value);
       if (value >= 30.0)
       {
           System.out.println("Obese");
       }
       else if(value>=25 && value<30)
       {
           System.out.println("Overweight");
       }
       else if(value>=18.5 && value<25)
       {
           System.out.println("Normal");
       }
       else
       {
           System.out.println("Underweight");
       }
    }
}
