package ProducerThread;

import java.util.LinkedList;
import java.util.List;

public class BufferEg {

    private List<Integer> buffer = new LinkedList<>();
    private int length;

    BufferEg(int length) {
        this.length = length;
    }

    public void addItem(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == length) {
                wait();
            }
            buffer.add(item);
            System.out.println("Item:" + item + " Added");
            notify();
        }
    }

    public void removeItem() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            int item = buffer.removeFirst();
            System.out.println("Item:" + item + " Removed");
            notify();
        }
    }
}