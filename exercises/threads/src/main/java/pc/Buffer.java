package pc;

public class Buffer {
    private int [] data = new int[10];
    private int readIndex, writeIndex, noMessages;
    public synchronized int getData() throws InterruptedException {
        System.out.println("Consumer getData()");
        while (noMessages == 0)
            wait();
        int nextValue = data[readIndex++];
        readIndex %= data.length;
        noMessages--;
        notifyAll();
        return nextValue;
    }
    public synchronized void addData(int value) throws InterruptedException {
        while (noMessages>=10)
            wait();
        data[writeIndex++] = value;
        noMessages++;
        writeIndex %= data.length;
        notifyAll();
    }
}