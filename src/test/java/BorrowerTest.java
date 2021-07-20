import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book theBorrowers;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        theBorrowers = new Book("The Borrowers", "Mary Norton", "fantasy");
        library = new Library();
    }

    @Test
    public void startsWithEmptyCollection(){
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        borrower.borrowBook(library);
        assertEquals(2, library.getBookCount());
        assertEquals(1, borrower.getCollectionCount());
        borrower.whatsTheBook();
    }
}
