import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Books {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private double price;

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

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class BookApplication {
    public static void main(String[] args) {
        List<Books> bookls = new ArrayList<>();
        bookls = addBook();
        System.out.println("Book Informations...");
        System.out.printf("%-25s%-25s\n", "Book Name", "Author of the Book");
        System.out.println();
        for (Books book : bookls) {
            System.out.printf("%-25s%-25s\n", book.getBookName(), book.getBookAuthor());

        }
    }

    public static List<Books> addBook() {
        Scanner sc = new Scanner(System.in);
        List<Books> bookList = new ArrayList<>();
        System.out.println("Enter the number of books to add...");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Book Name");
            String bookName = sc.nextLine();
            System.out.println("Enter the Author of the Book");
            String author = sc.nextLine();
            System.out.println("Enter the Book Price");
            double price = sc.nextDouble();
            sc.nextLine();
            Books book = new Books();
            book.setBookId(i + 1);
            book.setBookName(bookName);
            book.setBookAuthor(author);
            book.setPrice(price);
            bookList.add(book);
        }

        return bookList;

    }
}
