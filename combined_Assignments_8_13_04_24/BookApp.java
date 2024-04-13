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

public class BookApp {
    public static void main(String[] args) {
        List<Books> bookList = new ArrayList<>();
        mainMenu(bookList);
    }

    public static void mainMenu(List<Books> bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "\n 1.Add Books \n 2.Display Books   \n 3.Update Books \n 4. Delete Books \n Enter Your Choice");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                bookList = addBook();
                mainMenu(bookList);
                break;
            case 2:
                displayBook(bookList);
                break;
            case 3:
                updateBooks(bookList);
                break;
            case 4:
                deleteBooks(bookList);
                break;
            default:
                break;

        }
    }

    private static void updateBooks(List<Books> bookLists) {
        Scanner sc = new Scanner(System.in);
        if (bookLists.isEmpty()) {
            System.out.println("Book list Empty Please add Books");
            mainMenu(bookLists);
        } else {
            System.out.println("Choose the book to update the details");
            System.out.printf("%-25s%-25s%-25s\n", "S.No", "Book Name", "Author of the Book");
            System.out.println();
            for (Books book : bookLists) {
                System.out.printf("%-25d%-25s%-25s\n", book.getBookId(), book.getBookName(), book.getBookAuthor());

            }
            System.out.println("Choose the Option to Update the above book : ");
            int bookId = sc.nextInt();
            sc.nextLine();
            Books book = new Books();
            bookId = bookId - 1;
            book.setBookId(bookId);

            System.out.println("Choose the details to Update : ");
            System.out.println("1) Name \n2) Author \n 3) Price");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Book Name : ");
                    String bookName = sc.nextLine();
                    book.setBookName(bookName);
                    book.setBookAuthor(bookLists.get(bookId).getBookAuthor());
                    book.setPrice(bookLists.get(bookId).getPrice());
                    break;
                case 2:
                    System.out.println("Enter the new Author name : ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    book.setBookAuthor(author);
                    book.setBookName(bookLists.get(bookId).getBookName());
                    book.setPrice(bookLists.get(bookId).getPrice());
                    break;
                case 3:
                    System.out.println("Enter the new Price  : ");
                    Double price = sc.nextDouble();
                    book.setPrice(price);
                    book.setBookAuthor(bookLists.get(bookId).getBookAuthor());
                    book.setBookName(bookLists.get(bookId).getBookName());
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Enter a valid option...!!!\n");
                    break;

            }
            bookLists.remove(bookId);
            bookLists.add(book);
            System.out.println("Updated Successfully....");
            mainMenu(bookLists);
        }

    }

    private static void deleteBooks(List<Books> bookList) {
        Scanner sc = new Scanner(System.in);
        if (bookList.isEmpty()) {
            System.out.println("Book list Empty Please add Books");
            mainMenu(bookList);
        } else {
            System.out.println("Choose the book to update the details");
            System.out.printf("%-25s%-25s%-25s\n", "S.No", "Book Name", "Author of the Book");
            System.out.println();
            for (Books book : bookList) {
                System.out.printf("%-25d%-25s%-25s\n", book.getBookId(), book.getBookName(), book.getBookAuthor());

            }

            System.out.println("Choose the Option to Update the above book : ");
            int bookId = sc.nextInt();
            bookId = bookId - 1;
            sc.nextLine();
            String bookName = bookList.get(bookId).getBookName();
            bookList.remove(bookId);
            System.out.println(bookName + " Book is deleted Success fully");
        }
    }

    private static void displayBook(List<Books> bookls) {

        if (bookls.isEmpty()) {
            System.out.println("Book list Empty Please add Books");
            mainMenu(bookls);
        } else {
            System.out.println("Book Informations...");
            System.out.printf("%-25s%-25s\n", "Book Name", "Author of the Book");
            System.out.println();
            for (Books book : bookls) {
                System.out.printf("%-25s%-25s\n", book.getBookName(), book.getBookAuthor());

            }
            mainMenu(bookls);
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
        System.out.println("Books Added Successfully....");
        return bookList;

    }

}
