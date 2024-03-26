public class Books {
    private int bookId;
    private String bookName;
    private double price;
    private static String publisher;
    private String edition;
    private String isbn;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void displayBookInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
        System.out.println("Publisher: " + publisher);
        System.out.println("edition: " + edition);

    }

    public static String getPublisher() {
        return publisher;
    }

    public static void setPublisher(String publisher) {
        Books.publisher = publisher;
    }
}
