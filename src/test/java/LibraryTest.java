import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library myLibrary;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        myLibrary = new Library(5);
        book1 = new Book("Fellowship of the Ring", "J.R.R.Tolkien", "Fantasy");
        book2 = new Book("1984", "George Orwell", "Science Fiction");
        book3 = new Book("The Two Towers", "J.R.R.Tolkien", "Fantasy");

        myLibrary.addBookIfStockIsNotFull(book2);
    }

    @Test
    public void canAddBookToLibrary(){
        myLibrary.addBookIfStockIsNotFull(book1);
        assertEquals(2, myLibrary.countNumberOfBooks());
    }

    @Test
    public void canCheckOutBook(){
        myLibrary.addBookIfStockIsNotFull(book1);
        myLibrary.bookCheckOut();
        assertEquals(1, myLibrary.countNumberOfBooks());
    }

    @Test
    public void canGetNumOfBooksByGenre() {
        myLibrary.addBookIfStockIsNotFull(book1);
        myLibrary.addBookIfStockIsNotFull(book3);
        assertEquals(2, myLibrary.getCountByGenre("Fantasy"));
    }


}
