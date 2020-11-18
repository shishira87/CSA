
/**
 * Rock Paper Scissors Program
 * @author Shishir
 * @version 11.18.2020
 */
import java.util.*;
public class RPS
{
    private int score;
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!!");
        while(true) // keeps game going on
        {
            System.out.println("Your Play: ");
            String input = sc.nextLine();
            String output = generatePlay();
            System.out.println("Computer's Play: " + output);
            output = output.toLowerCase();
            input = input.toLowerCase();
            System.out.println(winner(input,output) + "\n\n");
        }
    }
    public static String generatePlay()
    {
        int value = (int) (Math.random() * 3);
        String[] list= {"Rock", "Paper", "Scissors"};
        return list[value];
    }
    public static String winner(String user, String computer)
    {
        if (user.equals(computer))
        {
            return "Tie!!";
        }
        else if(user.equals("rock"))
        {
            if(computer.equals("scissors"))
            {
                return "You win!!";
            }
            else
            {
                return "Computer Wins";
            } 
        }
        else if(user.equals("paper"))
        {
            if(computer.equals("rock"))
            {
                return "You win!!";
            }
            else
            {
                return "Computer Wins";
            }
        }
        else if(user.equals("scissors"))
        {
            if(computer.equals("paper"))
            {
                return "You win!!";
            }
            else
            {
                return "Computer Wins";
            }
        }
        else
        {
            return "Error";
        }
    }
}
