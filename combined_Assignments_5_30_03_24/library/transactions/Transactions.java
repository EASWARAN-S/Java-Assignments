package library.transactions;

public class Transactions {

    private int transactionId;
    private int memberId;
    private int bookId;
    private String transactionType;

    public Transactions(int transactionId, int memberId, int bookId, String transactionType) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.transactionType = transactionType;
    }

    public int getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getBookId() {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
