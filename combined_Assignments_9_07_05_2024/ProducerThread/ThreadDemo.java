public class ThreadDemo {
    public static void main(String[] args) {
        BufferEg buffer = new BufferEg(5);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
