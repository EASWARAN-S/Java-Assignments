package Program1;

public class PrinterMain {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(new TaskPrint(printer, "EaswarDocu 1"));
        Thread thread2 = new Thread(new TaskPrint(printer, "EaswarDocu 2"));
        Thread thread3 = new Thread(new TaskPrint(printer, "EaswarDocu 3"));
        Thread thread4 = new Thread(new TaskPrint(printer, "EaswarDocu 4"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}