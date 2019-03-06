import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is to make a register for readable's such as books with "ArrayList".
 *
 * @author Group 18
 * @version 1.1
 */
public class Register
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> bookRegister;

    /**
     * Constructor for objects of class Register
     */
    public Register() {
        this.bookRegister = new ArrayList<>();
    }
    
    /**
     * @return bookRegister as array list.
     */
    public ArrayList<Book> getBookRegister() {

        return bookRegister;
    }

    /**
     * @param book add the book to the book register (ArrayList).
     */
    public void add(Book book) {

        bookRegister.add(book);
    }
    
    /**
     * @param objectToBeRemoved remove the book from the book register (ArrayList).
     * @return true if object was successfully removed.
     */
    public boolean removeBook(String objectToBeRemoved) {
        boolean isBookRemoved = false;
        Iterator<Book> it = bookRegister.iterator();
        
        while(it.hasNext()) {
            if(it.next().getTitle().equals(objectToBeRemoved)) {
                it.remove();
                isBookRemoved = true;
            }
        }
        return isBookRemoved;
    }
    
    /**
     * List all books in the book register on the terminal.
     * @return bookList list of the titles of all the books
     */
    public String listAllBooks() {
        String bookList = "";
        
        for(Book book:bookRegister) {
            bookList += book.getTitle() + "\n";
        }
        return bookList;
    }
    
    /**
     * @param searchString put in the string of the book you want to search for 
     * from the array list "bookRegister".
     * List all books that contains the name you sent in.
     * @return bookFound
     */
    public String searchByName(String searchString) {
        boolean foundBook = false;
        String searchResult = "";
        
        for(Book book:bookRegister) {
            if(book.getTitle().contains(searchString) || book.getAuthor().contains(searchString) ||
            book.getGenre().contains(searchString)) {
                searchResult += "The book title is: " + book.getTitle() 
                + ". The book genre is: " + book.getGenre() 
                + ". The book author is: " + book.getAuthor()
                + "\n";
                foundBook = true;
            }
        }
        
        if(!foundBook){
                searchResult = ("No book with the name: " + searchString + " found.");
            }
        return searchResult;
    }
}
