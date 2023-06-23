public class LimitOrder extends Order {
    @Override
    public String toString() {
        return "LimitOrder's toString() " + super.toString();
    }

    @Override
    public boolean match(Order o) {
        return true;
    }

}
