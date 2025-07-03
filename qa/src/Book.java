
public class Book {

    private final int id;
    private final String title;
    private final String author;
    private final int price;

    private static int nextId = 0;

    public Book(String title, String author, int price) {
        this.id = ++nextId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return  "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
    }

    public void printDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
        }
    }