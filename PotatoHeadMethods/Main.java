
/**
 * Runs potatohead method.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class Main
     */
    public static void Main(String[] args)
    {
        // initialise instance variables
        PotatoHeadMethod nick = new PotatoHeadMethod("baseball","green", 20);
        PotatoHeadMethod rick = new PotatoHeadMethod("bowler","brown",23);
        PotatoHeadMethod mick = new PotatoHeadMethod("golf","blue",28);
        
        int nickAge = nick.getAge();
        int rickAge = rick.getAge();
        int mickAge = mick.getAge();
        
        System.out.println(rick.setAge());
        
        double average = PotatoHeadMethod.getAverages(rick.getAge(),mick.getAge(),nick.getAge());
        
        System.out.println(average);
        System.out.printf("%.2f", average);
    }
}