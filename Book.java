
/**
 * This class has the job to hold on a object book.
 * In this class you should be avaible to set book title, genre and author.
 *
 * @author Group 18
 * @version 0.1.
 */
public class Book
{
    private String genre;
    private String bookTitle;
    private String author;

    /**
     * Constructor for objects of class Book
     * 
     */
    public Book(String bookTitle, String genre, String author) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.author = author;
    }

    /**
     * @return the title of the book.
     */
    public String getTitle() {

        return this.bookTitle;
    }

    /**
     * @return the genre of the book.
     */
    public String getGenre() {

        return this.genre;
    }

    /**
     * @return the author of the book.
     */
    public String getAuthor() {

        return this.author;
    }
}
