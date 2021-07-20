import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("The Shining", "Stephen King", "horror");
    }

    @Test
    public void libraryHas3Books(){
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(4,library.getBookCount());
    }

    @Test
    public void cannotAddBookCapacityFull(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.getBookCount());
    }



}
