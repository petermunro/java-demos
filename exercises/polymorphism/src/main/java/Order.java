public abstract class Order {
    @Override
    public String toString() {
        return "Order's toString() " + super.toString();
    }

    public abstract boolean match(Order o);
}
