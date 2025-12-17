package WEEK2.BDA2513;

import java.time.Instant;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<MenuItem> menuItems;
    private Instant orderDate;

    public Order(Customer customer) {
        this.customer = customer;
        this.menuItems = new ArrayList<>();
        this.orderDate = Instant.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithBonuses(){
        double totalPrice = getTotalPrice();
        return totalPrice - customer.getBonus();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", menuItems=" + menuItems +
                ", orderDate=" + orderDate +
                '}';
    }
}
