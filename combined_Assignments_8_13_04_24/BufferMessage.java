import java.util.ArrayList;
import java.util.Scanner;

class CircularBuffer {
    private ArrayList<String> buffer;
    private int size;
    private int head;
    private int tail;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new ArrayList<>(size);
        this.head = 0;
        this.tail = 0;

    }

    public void addMessage(String message) {
        if (buffer.size() < size) {
            buffer.add(tail, message);
            tail = (tail + 1) % size;
        } else {
            buffer.set(head, message);
            head = (head + 1) % size;
            tail = (tail + 1) % size;
        }
    }

    public String getMessage(int index) {
        if (index < 0 || index >= buffer.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return buffer.get(index);
    }

    public int getSize() {
        return buffer.size();
    }
}

public class BufferMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Max Size: ");
        int n = sc.nextInt();
        sc.nextLine();

        CircularBuffer buffer = new CircularBuffer(n);
        buffer.addMessage("HI");
        buffer.addMessage("hello");
        buffer.addMessage("Welcome");
        buffer.addMessage("To");
        buffer.addMessage("zoho");
        buffer.addMessage("learn");

        System.out.println(buffer.getMessage(2));
    }
}
