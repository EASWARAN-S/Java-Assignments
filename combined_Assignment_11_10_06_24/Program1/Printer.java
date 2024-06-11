package Program1;

public class Printer {
    public void printDocument(String docuName) {
        synchronized (this) {
            System.out.println("Printing document: " + docuName + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}