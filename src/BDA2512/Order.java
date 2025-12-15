package BDA2512;

import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    public Order() {
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", menuItems=" + menuItems +
                '}';
    }
}
