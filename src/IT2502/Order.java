package IT2502;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> menuItems;
    private Courier courier;

    public Order() {
        this.menuItems = new ArrayList<>();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuItem menuItem : menuItems) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "menuItems=" + menuItems +
                ", courier=" + courier +
                '}';
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }
}
