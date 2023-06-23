public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MessageDisplayer(), "Thread 1");
        Thread t2 = new Thread(new MessageDisplayer(), "Thread 2");
        System.out.println("Starting threads...");
        t1.setDaemon(true);
        t2.setDaemon(false);
        t1.start();
        t2.start();
        System.out.println("[Main thread] Waiting...");
    }
}
