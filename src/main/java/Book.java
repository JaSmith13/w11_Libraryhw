public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.author = author;
        this.genre = genre;
        this.title = title;
    }

    public String getBookInfo(){
        return String.format("%s by %s", title, author);
    }

    public String getGenre(){
        return this.genre;
    }
}
