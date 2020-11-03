
/**
 * Main class runs program and handles Book objects
 *
 * @author Shishir Sudhaman
 * @version 11.1.2020
 */
public class Main
{
    // Program runs in main static function
    public static void main (String[] args)
    {
        // Creating 2 Book objects with smaller constructor
         Book omnm = new Book("Of Mice and Men", "John Steinbeck",107);
        Book mtam = new Book("The Metamorphosis", "Franz Kafka", 82);
        // Creating 2 Book objects with bigger constructor
        Book tlop = new Book("The Life of Pi", "Yann Martel", 419, "Adventure Fiction");
        Book bigb = new Book("1984","George Orwell",328,"Dystopian Fiction");
        
        //assigning ratings for each book
        double omnm_ratings = omnm.addRatings();
        double mtam_ratings = mtam.addRatings();
        double tlop_ratings = tlop.addRatings();
        double bigb_ratings = bigb.addRatings();
        
        // Average calculated by taking sum of ratings and dividing by 4
        double average = (omnm_ratings + mtam_ratings + tlop_ratings + bigb_ratings)/4.0;
        
        // assigning title to local strings
        String omnm_title = omnm.getTitle();
        String mtam_title = mtam.getTitle();
        String tlop_title = tlop.getTitle();
        String bigb_title = bigb.getTitle();
        
        // sum of title lengths by adding string lengths
        int sumOfTitles = omnm_title.length() + mtam_title.length() + tlop_title.length() + bigb_title.length();
        
        // sum of last letters by concatenating (length-1)
         String sumOfTitle = omnm_title.substring(omnm_title.length()-1) + mtam_title.substring(mtam_title.length()-1) + tlop_title.substring(tlop_title.length()-1) + bigb_title.substring(bigb_title.length()-1);
        
        // assigning author names to local Strings
        String omnm_author = omnm.getAuthor();
        String mtam_author = omnm.getAuthor();
        String tlop_author = tlop.getAuthor();
        String bigb_author = bigb.getAuthor();
        
        // Sum of author name first letters added by concatening String index 0 of each string
        String sumOfAuthor = omnm_author.substring(0,1) + mtam_author.substring(0,1) + tlop_author.substring(0,1) + bigb_author.substring(0,1);
                
        // Print upper column headers
        System.out.println("Title\t\t Author\t\t # of pages\t Genre\t\t Rating");
        
        // Print formatted book information
        System.out.print(omnm_title + " by " + omnm_author + " with " + omnm.getPages() + " of " + omnm.getGenre() + " with a rating of ");
        System.out.printf("%.2f\n\n",omnm_ratings);
        System.out.print(mtam_title + " by " + omnm_author + " with " + mtam.getPages() + " of " + mtam.getGenre() + " with a rating of ");
        System.out.printf("%.2f\n\n",mtam_ratings);
        System.out.print(tlop_title + " by " + tlop_author + " with " + tlop.getPages() + " of " + tlop.getGenre() + " with a rating of ");
        System.out.printf("%.2fn\n",tlop_ratings);
        System.out.print(bigb_title + " by " + bigb_author + " with " + bigb.getPages() + " of " + bigb.getGenre() + " with a rating of ");
        System.out.printf("%.2f\n\n",bigb_ratings);
        
        System.out.println("The sum of book pages is " + omnm.getPages() + mtam.getPages() + tlop.getPages() + bigb.getPages());
        System.out.println("The sum of title characters is " + sumOfTitles);
        System.out.println("First letter sum of authors' names concatenated is " + sumOfAuthor);
        System.out.println("Last letter sum of titles' names concatenated is " + sumOfTitles);
        System.out.println("The average of ratings is " + average);
        
    }
}
