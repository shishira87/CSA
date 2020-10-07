
/**
* Write a description of class Book here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class Book
{
    // instance variables - replace the example below with your own
    private int numPages;
    private int currentPage;
    /**
     * Constructor for objects of class Book
     */
    public Book(int pages, int currentpage)
    {
        // initialise instance variables
        numPages = pages;
        currentPage = currentpage;
    }
    public Book(int pages)
    {
        numPages = pages;
    }
    public static int pagesLeft(int totalPages, int currentpage)
    {
        return (totalPages - currentpage);
    }
        
    public static void main(String[] args)
    {
        // put your code here
        Book book1 = new Book(100,15);
        Book book2 = new Book(200);
        
        System.out.print("The first book has " + book1.numPages + " pages,");
        System.out.println("and is currently on page " + book1.currentPage + ".");
        System.out.println("There are " + pagesLeft(book1.numPages,book1.currentPage) + " pages left");
        System.out.println("The second book has "+ book2.numPages + " pages.");
        
    }
}
