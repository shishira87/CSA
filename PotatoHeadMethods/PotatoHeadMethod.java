
/**
 * Testing methods with potatohead class
 *
 * @author Shishir Sudhaman
 * @version 10.16.2020
 */
public class PotatoHeadMethod
{
    // instance variables - replace the example below with your own
    private String hat;
    private String eyes;
    private int age;
    private String hair;
    private int height;
 
    /**
     * Constructor for objects of class PotatoHeadMethod
     */
    public PotatoHeadMethod(String Hat, String Eyes, int Age)
    {
        // initialise instance variables
        hat = Hat;
        eyes = Eyes;
        age = Age;
    }
    public PotatoHeadMethod(String Hat, int Age)
    {
        hat = Hat;
        age = Age;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAge()
    {
        return age;
    }
    public int setAge()
    {
        // put your code here
        int personAge = getAge();
        personAge++;
        return personAge;
    }
    public static double getAverages(int age1, int age2, int age3)
    {
        double average = (age1+age2+age3)/3;
        return average;
    }
}
