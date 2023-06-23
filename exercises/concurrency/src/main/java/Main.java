public class Main {
    private int balance  = 100;
    public static void main(String[] args) {

    }

    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        return balance;
    }

}
