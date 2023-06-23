package pc;

public class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            System.out.println("Consumer starting");
            for (int i = 0; i < 100; i++) {
                System.out.println("Consumer: " + i);
                System.out.format("message %d%n", buffer.getData());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}