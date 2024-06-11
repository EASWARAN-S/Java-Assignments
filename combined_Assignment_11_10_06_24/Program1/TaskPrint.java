package Program1;

public class TaskPrint implements Runnable {
    private Printer printer;
    private String docuName;

    public TaskPrint(Printer printer, String docuName) {
        this.printer = printer;
        this.docuName = docuName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            printer.printDocument(docuName);
        }
    }
}