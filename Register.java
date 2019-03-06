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
     */
    public String listAllBooks() {
        String bookList = "";
        
        for(Book book:bookRegister) {
            bookList = bookList + book.getTitle() + "\n";
        }
        return bookList;
    }
    
    /**
     * @param bookName put in the name of the book you want to find from the array list "bookRegister".
     * List all books that contains the name you sent in.
     */
    public String searchByName(String bookName) {
        boolean foundBook = false;
        String bookFound = "";
        
        for(Book book:bookRegister) {
            if(book.getTitle().contains(bookName)) {
                bookFound = bookFound + (
                "The book title is: " + book.getTitle() 
                + ". The book genre is: " + book.getGenre() 
                + ". The book author is: " + book.getAuthor())
                + "\n";
                foundBook = true;
            }
        }
        
        if(!foundBook){
                bookFound = ("No book with the name: " + bookName + " found.");
            }
        return bookFound;
    }
    
    public void generateTestBooks() {
      Book book1 = new Book("Hello World!", "Comedy", "Alan Turing");
      Book book2 = new Book("Kua sier Møø", "Horror", "Harry Potter");
      Book book3 = new Book("Runescape wiki", "Non-Fiction", "Everyone");
      Book book4 = new Book("Hello my little friend", "Science fiction", "Lisa Simpson");
      
      add(book1);
      add(book2);
      add(book3);
      add(book4);
    }
}
