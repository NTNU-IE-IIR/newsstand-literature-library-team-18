

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RegisterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RegisterTest
{
    /**
     * Default constructor for test class RegisterTest
     */
    public RegisterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void AddAndRemoveBookTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
        Register register1 = new Register();
        register1.add(book1);
        assertEquals(true, register1.removeBook("Cat"));
    }

    @Test
    public void bookSearchTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
        Register register1 = new Register();
        register1.add(book1);
        assertEquals("The book title is: " + "Cat" 
                + ". The book genre is: " + "Horror" 
                + ". The book author is: " + "Catman"
                + "\n", register1.searchByName("Cat"));
    }

    @Test
    public void registerSizeTest()
    {
        Book book1 = new Book("Cat", "Horror", "abc");
        Book book2 = new Book("Dog", "Horror", "cba");
        Register register1 = new Register();
        register1.add(book1);
        register1.add(book2);
        assertEquals(2, register1.getArrayLength());
    }

    /**
     * @return false and fail to remove any books.
     */
    @Test
    public void RemoveToFailTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
        Register register1 = new Register();
        register1.add(book1);
        assertFalse(register1.removeBook("Cats"));
    }
}






