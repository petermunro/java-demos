package pc;

public class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            System.out.println("Producer starting");
            for (int i = 0; i < 100; i++) {
                System.out.println("Producer: " + i);
                buffer.addData(i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}