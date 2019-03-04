import java.util.ArrayList;

/**
 * Write a description of class Register here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * @param bookName add the book to the book register (ArrayList).
     */
    public void addBook(Book bookName) {
        bookRegister.add(bookName);
    }
    
    /**
     * @param bookName remove the book from the book register (ArrayList).
     */
    public void removeBook(Book bookName) {
        bookRegister.remove(bookName);
    }
    
    /**
     * List all books in the book register on the terminal.
     */
    public void listAllBooks() {
        int index = 0;
        
        System.out.println("The books you have:");
        while(index < bookRegister.size()) {
            Book book = bookRegister.get(index);
            System.out.println(book.getBookTitle());
            index++;
        }
    }
    
    /**
     * @param bookName put in the name of the book you want to find from the array list "bookRegister".
     * List all books that contains the name you sent in.
     */
    public void searchOnBook(String bookName) {
        int index = 0;
        boolean foundBook = false;
        
        while(index < bookRegister.size()) {
            Book book = bookRegister.get(index);
            
            if(book.getBookTitle().contains(bookName)) {
                System.out.println("The book title is: " + book.getBookTitle() + ". The book genre is: " + book.getGenre() + ". The book author is: " + book.getAuthor());
                foundBook = true;
            }
            
            index++;
        }
        
        if((index == bookRegister.size()) && (foundBook == false)){
                System.out.println("No book with the name: " + bookName + " found.");
            }
    }
}

