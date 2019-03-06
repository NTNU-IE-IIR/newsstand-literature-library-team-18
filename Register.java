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

    /*
     * @return bookRegister as an arraylist
     */
    public ArrayList<Book> getRegister() {
        return bookRegister;
    }

    /**
     * @param bookName add the book to the book register (ArrayList).
     */
    public void add(Book bookName) {
        bookRegister.add(bookName);
    }

    /**
     * @param bookName remove the book from the book register (ArrayList).
     */
    public void remove(Book bookName) {
        bookRegister.remove(bookName);
    }

    /**
     * List all books in the book register on the terminal.
     */
    public String listAllBooks() {
        String bookList = "";

        for(Book book: bookRegister) {
            bookList = bookList + book.getBookTitle() + "\n";
        }
        return bookList;
    }

    /**
     * @param bookName put in the name of the book you want to find from the array list "bookRegister".
     * List all books that contains the name you sent in.
     */
    public String searchByName(String bookName) {
        boolean foundBook = false;
        String booksFound = "";

        for(Book book: bookRegister) {
            if(book.getBookTitle().contains(bookName)) {
                foundBook = true;
                booksFound = booksFound + (
                "The book title is: " + book.getBookTitle() 
                + ". The book genre is: " + book.getGenre() 
                + ". The book author is: " + book.getAuthor())
                + "\n";
            }
        }

        if(!foundBook) {
            booksFound = "No book with the name: " + bookName + " found.";
        }
        return booksFound;       
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