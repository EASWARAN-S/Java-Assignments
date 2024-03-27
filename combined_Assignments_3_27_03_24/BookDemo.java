import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private static int bookId;
    private String bookName;
    private double price;
    private String publisher;
    private String edition;
    private String isbn;

    public Book(String bookName, double price, String publisher, String edition, String isbn) {

        this.bookName = bookName;
        this.price = price;
        this.publisher = publisher;
        this.edition = edition;
        this.isbn = isbn;
        bookId++;
    }

    public int getBookId() {
        return bookId;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}

public class BookDemo {

    static String bookName;
    static String isbn;
    static String publisher;
    static String edition;
    static double price;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Books");
        int bookSize = sc.nextInt();
        List<Book> bookslist = new ArrayList<>();
        for (int i = 0; i < bookSize; i++) {
            new BookDemo().addBooks();
            bookslist.add(new Book(bookName, price, publisher, edition, isbn));
        }
        System.out.println("The Books are ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "S.No", "BookName", "Price", "Publisher", "Edition",
                "ISBN");
        for (int i = 0; i < bookslist.size(); i++) {
            System.out.printf("%-15s%-15s%-15.2f%-15s%-15s%-15s\n", (i + 1), bookslist.get(i).getBookName(),
                    bookslist.get(i).getPrice(), bookslist.get(i).getPublisher(), bookslist.get(i).getEdition(),
                    bookslist.get(i).getIsbn());
        }
    }

    private void addBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name");
        bookName = sc.nextLine();
        System.out.println("Enter the Book ISBN Number");
        isbn = sc.nextLine();
        System.out.println("Enter the Book Publisher Name");
        publisher = sc.nextLine();
        System.out.println("Enter the Book Edition");
        edition = sc.nextLine();
        System.out.println("Enter the Book Price");
        price = sc.nextDouble();
        sc.nextLine();

    }
}