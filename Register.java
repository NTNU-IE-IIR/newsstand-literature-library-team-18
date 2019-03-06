import java.util.ArrayList;

/**
 * This is the class of the registers
 *
 * @author Brage Tranvik
 * @version 2019-03-05
 */
public class Register
{
    private ArrayList<Book> bookArrayList;

    /**
     * Constructor for objects of class Register
     */
    public Register()
    {
        bookArrayList = new ArrayList<>();
    }
  
    /**
     * Adds a book to the bookArrayList
     * @param book The book you want to add
     */
    public void addBook(Book book)
    {
        bookArrayList.add(book);
    }

    /**
     * Search the bookArrayList by title
     * @param searchString Tile you're looking for
     */
    public String searchBooks(String searchString)
    {
        String string = "";
        String errorString = "ERROR: No search results.";
        
        for (Book book : bookArrayList)
        {
            if (book.getTitle().contains(searchString) || book.getAuthor().contains(searchString) ||
            book.getGenre().contains(searchString))
            {
                string += "Title: " + book.getTitle() + ", " + "Author: " + book.getAuthor() +
                ", " + "Genre: " + book.getGenre() + "\n";
            }
        }
        
        if (!string.isBlank())
        {
            return string;
        }
        else
        {
            return errorString;
        }
    }

    /**
     * List all books in the bookArrayList
     * @return string The titles as a string
     */
    public String listAllBooks()
    {
        String string = "";
        String errorString = "ERROR: No books found.";
        if (!bookArrayList.isEmpty())
        {
            for (Book book : bookArrayList)
            {
                string += "Title: " + book.getTitle() + ", " + "Author: " + book.getAuthor() +
                ", " + "Genre: " + book.getGenre() + "\n";
                // return book.getTitle()
            }
            return string;
        }
        else
        {
            return errorString;
        }
    }
    
    /**
     * Remove a book from the bookArrayList
     * @param book The book you want to remove
     */
    public void removeBook(Book book)
    {
        bookArrayList.remove(book);
    }
}
