package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BooksTest {

    private Book book;
    private Borrower currentBorrower;

    @Before
    public void setUp() throws Exception {
        currentBorrower = new Borrower("Ed");
        book = new Book("The island", "Victoria Hislop", true, currentBorrower);
    }

    @Test
    public void canGetTitle() {
        assertEquals("The island", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Victoria Hislop", book.getAuthor());
    }

    @Test
    public void canGetOnLoanResult() {
        assertTrue(book.isOnLoan());
    }

    @Test
    public void canGetCurrentBorrower() {
        assertEquals("Ed", book.getCurrentBorrower().getName());
    }
}
