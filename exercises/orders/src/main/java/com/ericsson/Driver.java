package com.ericsson;

public class Driver {
    public static void main(String[] args) {
        Order o1 = new Order("AAPL", "USD", 13647);
        Order o2 = o1;
        Order o3 = new Order("AAPL", "USD", 13647);

        System.out.println(o1 == o2);       // true
        System.out.println(o1 == o3);       // false
        System.out.println(o1.equals(o3));
    }


}
