

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookTest..
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
{
    /**
     * Default constructor for test class BookTest
     */
    public BookTest()
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
    public void makeBookTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
    }

    @Test
    public void getTitleTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
        assertEquals("Cat", book1.getTitle());
    }

    @Test
    public void getGenreTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
        assertEquals("Horror", book1.getGenre());
    }

    @Test
    public void getAuthorTest()
    {
        Book book1 = new Book("Cat", "Horror", "Catman");
        assertEquals("Catman", book1.getAuthor());
    }
}




