 
/**
 * Write a description of class expenses here.
 *
 * @author Shishir Sudhaman
 * @version 10.02.2020
 */
import java.util.Scanner;
public class expenses
{
    // Calculates monthly expenses
    public static void expenses(String[] args)
    {
        // starting new scanner object
        Scanner sc = new Scanner(System.in);
        
        // Asks user for expense values and scanner accepts next integer in instantiated variable
        System.out.println("Please enter in your hourly income");
        int hourlyIncome = sc.nextInt(); //= 27;
        System.out.println("Please enter in your monthly rent");
        int monthlyRent = sc.nextInt();//= 1695;
        System.out.println("Please enter in your monthly grocery expenses");
        int monthlyGroceries = sc.nextInt();// = 280
        System.out.println("Please enter in your monthly gym membership price");
        int monthlyGym = sc.nextInt();// = 30
        System.out.println("Please enter in your monthly phone plan");
        int monthlyPhone = sc.nextInt();// = 30;
        System.out.println("Please enter in how many hours a week you work");
        int hoursPerWeek = sc.nextInt();// = 40;
        System.out.println("Please enter in your monthly transit costs");
        int monthlyTransit = sc.nextInt();// = 85;
        
        // calculated values declaration
        int totalExpenses, totalSavings, totalIncome;
        
        //calculations
        totalIncome = hourlyIncome * hoursPerWeek * 4;
        totalExpenses = monthlyRent + monthlyGroceries + monthlyGym + monthlyPhone + monthlyTransit;
        totalSavings = totalIncome - totalExpenses;
        
        //output monthly income and expenses
        System.out.println("\n\nYour total monthly income is $" + totalIncome);
        System.out.println("Your total total monthly costs are $" + totalExpenses);
        
        // output for matching case
            if(totalSavings > 0){
            System.out.println("Your monthly savings are $" + totalSavings + "! That's great!!");
        }   else  if (totalSavings < 0){
            System.out.println("You're running at a loss of $" + (-1 * totalSavings) + ". Better get on top of that!!" );
        }   else{
            System.out.println("You didn't save anything this month.");
        }
    }
}
