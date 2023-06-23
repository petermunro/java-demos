package com.ericsson;

import java.util.Objects;

public class Order {
    private java.lang.String symbol;
    private String currency;
    private int amount;

    private static int numberOfOrders;

    public Order(String symbol, String currency, int amount) {
        this.symbol = symbol;
        this.currency = currency;
        this.amount = amount;
        numberOfOrders++;
    }

    public Order(String symbol) {
        this(symbol, "USD", 0);
    }

    public Order() {
        this("UNDEFINED");
    }

    @Override
    public String toString() {
        return "com.ericsson.Order{" +
                "symbol='" + symbol + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static int getNumberOfOrders() {
        return numberOfOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return amount == order.amount && Objects.equals(symbol, order.symbol) && Objects.equals(currency, order.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, currency, amount);
    }
}
