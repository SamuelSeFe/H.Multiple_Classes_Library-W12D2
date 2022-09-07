import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> booksList;
    private int capacity;
    private HashMap<String, Integer> genreTracking;

    public Library(int capacity){
        this.booksList = new ArrayList<>();
        this.capacity = capacity;
        this.genreTracking = new HashMap<>();
    }

    public void addBookIfStockIsNotFull(Book book) {
        if (this.capacity > this.booksList.size()) {
            this.booksList.add(book);
            this.getBookGenre(book);
        }
    }

    public int countNumberOfBooks(){
        return this.booksList.size();
    }

    public Book bookCheckOut(){
        return this.booksList.remove(0);
    }

    public void getBookGenre(Book book){
        String genre = book.getGenre();
        if (this.genreTracking.keySet().contains(genre)){
            int current = this.genreTracking.get(genre);
            this.genreTracking.replace(genre, current + 1);
        } else {
            this.genreTracking.put(genre, 1);
        }
    }

    public int getCountByGenre(String key){
        return this.genreTracking.get(key);
    }

//    private void addToGenreHashmap(Book book){
//        for (Book b: booksList) {
//            genreTracking.putIfAbsent(b.getGenre(), 0);
//            genreTracking.put(b.getGenre(), genreTracking.get(b.getGenre())+1);
//        }
//    } --> Nathaniel's solution using .putIfAbsent (CHECK IT OUT)


}
