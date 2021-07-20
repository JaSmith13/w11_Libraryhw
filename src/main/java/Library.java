import java.util.ArrayList;

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
}
