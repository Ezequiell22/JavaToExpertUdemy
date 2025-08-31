

public class Book {

    private String author;
    private String title;
    private int pages;
    private Type type;

    public Book(Type type, int pages, String title, String author) {
        this.type = type;
        this.pages = pages;
        this.title = title;
        this.author = author;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", type=" + type +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
