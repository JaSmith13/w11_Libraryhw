import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.capacity = 4;
        this.books = new ArrayList<>();
        books.add(new Book("Sleepy Hollow","Washington Irving", "horror"));
        books.add(new Book("Dracula", "Bram Stoker", "horror"));
        books.add(new Book("Northern Lights", "Philip Pullman", "fantasy"));

    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(getBookCount() < capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
       return this.books.remove(0);
    }

    public HashMap findGenres() {
        HashMap<String, Integer> genres = new HashMap();
        for (Book book: books){
            String genre = book.getGenre();
            if (genres.containsKey(genre)){
                genres.put(genre, genres.get(genre) +1);
            } else {
                genres.put(genre, 1);
            }
        }
        return genres;
    }
}
