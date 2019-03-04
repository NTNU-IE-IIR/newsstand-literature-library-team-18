/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String genre;
    private String bookTitle;
    private String author;

    /**
     * Constructor for objects of class Book
     */
    public Book(String bookTitle, String genre, String author) {
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.author = author;
    }

    /**
     * @param bookTitle update the book title.
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * @param genre update the genre of the book.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @param author update the author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the title of the book.
     */
    public String getBookTitle() {
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
