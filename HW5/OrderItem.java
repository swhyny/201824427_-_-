package com.cafe.order;
import com.cafe.menu.*;
public class OrderItem {
    Beverage beverage;
    int quantity;

    public OrderItem(Beverage beverage, int quantity) {
        this.beverage = beverage;
        this.quantity = quantity;
    }

    public String toString() {
        String msg = "[ name=" + beverage.getName() + ", Price=" + beverage.getprice()
                + ", size=" + beverage.getsize() + ", quantity=" + quantity + " ]";
        return msg;
    }

    public int getQuantity() {
        return quantity;
    }
}
