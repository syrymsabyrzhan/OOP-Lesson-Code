package WEEK2.IT2506;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<MenuItem> menuItems;

    public Order(Customer customer) {
        this.customer = customer;
        menuItems = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(MenuItem item : menuItems){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithBonus(){
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



    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", menuItems=" + menuItems +
                '}';
    }
}
