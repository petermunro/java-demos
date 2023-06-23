public class MessageDisplayer implements Runnable {
    private String name;

    @Override
    public void run() {
        this.name = Thread.currentThread().getName();
        System.out.printf("[%s] Job starting...%n", name);
        for (int i=0; i < 10; i++) {
            System.out.printf("[%s] MessageDisplayer: i is now: %d%n", name, i);
            for (int j = 0; j < 1000; j++) {}
        }
        System.out.printf("[%s] Job finished%n", name);
    }
}
