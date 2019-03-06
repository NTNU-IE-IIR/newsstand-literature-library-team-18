
/**
 * This a class for books containg the values
 * title, author and genre.
 * Methods are included for accessing and setting
 * these values.
 *
 * @author Brage Tranvik
 * @version 2019-03-05
 */
public class Book
{
    private String title;
    private String author;
    private String genre;

    /**
     * Constructor for objects of class Book
     * @param title Title of the book
     * @param author Author of the book
     * @param genre Genre of the book
     */
    public Book(String title, String author, String genre)
    {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
   
    // --ACCESSORS--
    /**
     * Method that sets the title of the book
     * @param title Title of the book
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    /**
     * Method that sets the author of the book
     * @param author Author of the book
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    /**
     * Method that sets the genre of the book
     * @param genre Genre of the book
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    // --MUTATORS--
    /**
     * Method that returns the title of the book
     * @return title Title of the book 
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Method that returns the author of the book
     * @return author Author of the book 
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Method that returns the genre of the book
     * @return grenre Genre of the book 
     */
    public String getGenre()
    {
        return genre;
    }
}
