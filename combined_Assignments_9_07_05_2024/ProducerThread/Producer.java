
public class Producer extends Thread {
    private BufferEg buffer;

    Producer(BufferEg buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 15; i++) {
                buffer.addItem(i);
                Thread.sleep(1200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}