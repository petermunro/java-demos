package pc;

public class Driver {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        Thread pThread = new Thread(producer);
        Thread cThread = new Thread(consumer);
        cThread.start();
        pThread.start();
    } }