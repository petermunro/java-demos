public class MarketOrder extends Order {
    @Override
    public String toString() {
        return "MarketOrder's toString() " + super.toString();
    }

    @Override
    public boolean match(Order o) {
        return false;
    }
}
