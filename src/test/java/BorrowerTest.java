import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book1;
    Book book2;
    Library library;
    Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(5);
        book1 = new Book("Fellowship of the Ring", "J.R.R.Tolkien", "Fantasy");
        book2 = new Book("1984", "George Orwell", "Science Fiction");
        borrower = new Borrower();

        library.addBookIfStockIsNotFull(book1);

    }

    @Test
    public void borrowNewBook(){
        borrower.borrowBook(library);
        assertEquals(1, borrower.getNumberOfBorrowedBooks());
    }
}
