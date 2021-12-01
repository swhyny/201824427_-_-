package com.cafe.order;
import com.cafe.menu.*;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    public void add(OrderItem item) {
        items.add(item);
    }

    public int cost() {
        int cost = 0;
        for (OrderItem i : items) {
            cost += (i.beverage.getprice() * i.getQuantity());
        }
        return cost;
    }

    public boolean setSize(String name, String size) {
        for (OrderItem i : items) {
            if (name.equals(i.beverage.getName())) {
                return i.beverage.setSize(size);
            }
        }
        return false;
    }

    public void print() {
        for (OrderItem i : items) {
            System.out.println(i);
        }
        System.out.printf("Total: %,d%n", cost());
    }
}
