package Program2;

public class BResource {

    public void method2(AResource aResource) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on BResource");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (aResource) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on AResource");
            }
        }
    }

}