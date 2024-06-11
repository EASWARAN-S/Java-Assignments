package Program2;

public class ResourceDemo {

    public static void main(String[] args) {
        AResource a1Resource = new AResource();
        BResource b1Resource = new BResource();

        Thread thread1 = new Thread(() -> {
            a1Resource.method1(b1Resource);
        }, "Thread 1");
        Thread thread2 = new Thread(() -> {
            b1Resource.method2(a1Resource);
        }, "Thread 2");
        thread1.start();
        thread2.start();
    }

}
