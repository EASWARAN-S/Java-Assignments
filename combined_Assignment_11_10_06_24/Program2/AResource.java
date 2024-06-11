package Program2;

public class AResource {

    public void method1(BResource bResource) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on AResource ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (bResource) {
                System.out.println(Thread.currentThread().getName() + " acquired lock on BResource");
            }
        }
    }

}