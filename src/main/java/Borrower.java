import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowersBooks;

    public Borrower(){
        this.borrowersBooks = new ArrayList<Book>();
    }

    public void borrowBook(Library library){
        this.borrowersBooks.add(library.bookCheckOut());
    }

    public int getNumberOfBorrowedBooks(){
        return this.borrowersBooks.size();
    }

}
