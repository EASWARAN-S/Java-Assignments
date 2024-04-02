package library;

import library.books.Books;
import library.members.Members;
import library.transactions.Transactions;

public class LibraryMain {
    public static void main(String[] args) {
        Books book = new Books(1, "Java", "BALAGURUSAMY", "Pearson", 1);
        Members members = new Members(1, 1, "Easwar", 1, "TVL", "abc@gmail.com", "9845612345", 1);
        Transactions transaction = new Transactions(1, 1, 1, "Borrowed");
        System.out.println("Book was borrowed by" + members.getName());
    }
}
