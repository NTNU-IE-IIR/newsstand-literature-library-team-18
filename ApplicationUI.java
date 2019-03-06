import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * 
 * @author asty
 * @version 1.1
 */
public class ApplicationUI {

    private Register bookRegister;
    private Scanner reader;

    // The menu tha will be displayed. Please edit/alter the menu
    // to fit your application (i.e. replace "product" with "literature"
    // etc.
    private String[] menuItems = {
            "1. List all products",
            "2. Add new product",
            "3. Remove product",
            "4. Find a product by name",
        };

    /**
     * Creates an instance of the ApplicationUI User interface. 
     */
    public ApplicationUI() {
        this.bookRegister = new Register();
        this.reader = new Scanner(System.in);
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void start() {
        this.init();

        boolean quit = false;

        while (!quit) {
            try {
                int menuSelection = this.showMenu();
                switch (menuSelection) {
                    case 1:
                    this.listAllProducts();
                    break;

                    case 2:
                    this.addNewProduct();
                    break;

                    case 3:
                    this.removeProduct();
                    break;

                    case 4:
                    this.findProductByName();
                    break;

                    case 5:
                    System.out.println("\nThank you for using Application v0.1. Bye!\n");
                    quit = true;
                    break;

                    default:
                }
            } 
            catch (InputMismatchException ime) {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException {
        System.out.println("\n**** Application v0.1 ****\n");
        // Display the menu
        for ( String menuItem : menuItems ) {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user

        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

    // ------ The methods below this line are "helper"-methods, used from the menu ----
    // ------ All these methods are made privat, since they are only used by the menu ---

    /**
     * Initializes the application.
     * Typically you would create the LiteratureRegistrer-instance here
     */
    private void init() {
        System.out.println("init() was called");
    }

    /**
     * Lists all the products/literature in the register
     */
    private void listAllProducts() {
        if(bookRegister.getBookRegister().isEmpty()) {
            System.out.println("You don't have any books.");
        }
        else {
            System.out.println("The books you have is:");
            System.out.println(bookRegister.listAllBooks());
        }
    }

    /**
     * Add a new product/literature to the register.
     * In this method you have to add code to ask the
     * user for the necessary information you need to 
     * create an instance of the product, which you
     * then send as a parameter to the addNewspaper()-
     * method of the register.
     * Remember to also handle invalid input from the
     * user!!
     */
    private void addNewProduct() {
        System.out.println("addNewProduct() was called");

        System.out.println("Enter name: ");
        String bookName = reader.next();

        System.out.println("Enter genre: ");
        String bookGenre = reader.next();

        System.out.println("Enter author: ");
        String bookAuthor = reader.next();

        bookRegister.add(new Book(bookName, bookGenre, bookAuthor));
        System.out.println("Book register successful");
    }

    /**
     * Find and remove a product based on the input name (title).
     *
     */
    private void removeProduct() {
        System.out.println("Enter name of product you want to remove: ");
        String bookName = reader.next();

        if(bookRegister.removeBook(bookName)) {
            System.out.println("The book with the name " + bookName + " is removed.");
        }
        else{
            System.out.println("No book with the name " + bookName + " found.");
        }
    }

    /**
     * Find and display a product based om name (title).
     * As with the addNewProduct()-method, you have to
     * ask the user for the string (name/title/publisher)
     * to search for, and then use this string as input-
     * parameter to the method in the register-object.
     * Then, upon return from the register, you need
     * to print the details of the found item.
     */
    private void findProductByName() {        
        System.out.println("Enter search: ");
        String search = reader.next();
        System.out.println(bookRegister.searchByName(search));
    }

}
