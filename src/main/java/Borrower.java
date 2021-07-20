import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int getCollectionCount() {
        return collection.size();
    }

    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }

    public void whatsTheBook(){
        System.out.println(this.collection.get(0).getBookInfo());
    }
}
