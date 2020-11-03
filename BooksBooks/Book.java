
/**
 * Book Class Definition
 *
 * @author Shishir Sudhaman
 * @version 10.29.2020
 */
import java.util.*;
public class Book
{
    // instance variables - outline for attributes for each Book object
    private int pages;
    private double ratings;
    private String author;
    private String genre;
    private String title;

    /**
     * Constructor for objects of class Book
     */
    // extra c in variable names represents the word "constructor" for use in constructors
    public Book(String titlec, String authorc, int pagesc)
    {
        // initialise instance variables to parameters
       title = titlec;
       author = authorc;
       pages = pagesc;
       genre = "Unknown";
    }
    public Book(String titlec, String authorc, int pagesc, String genrec)
    {
       // initialise instance variables to parameters
       title = titlec;
       author = authorc;
       pages = pagesc;
       genre = genrec; 
    }
    /** gives a random rating to Book object's ratings attibute between 0-5
     * returns double value of rating
    */ 
    public double addRatings()
    {
       ratings = (double) Math.random()*5; // returns double value between 0-5
       return ratings;
    }
    public String getAuthor() // getter method for author attribute
    {
        return author;
    }
    public String getTitle() //getter method for 
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public String getGenre() //getter method for 
    {
        return title;
    }
}
    
    
    
    
    
