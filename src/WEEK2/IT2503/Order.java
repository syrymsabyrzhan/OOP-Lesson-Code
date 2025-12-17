package WEEK2.IT2503;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Person person;
    private List<MenuItem> menuItemList;

    public Order(int id, Person person) {
        this.id = id;
        this.person = person;
        this.menuItemList = new ArrayList<>();
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (MenuItem menuItem : menuItemList) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice;
    }

    public double getTotalCostWithBonus() {
        double totalPrice = 0.0;
        for (MenuItem menuItem : menuItemList) {
            totalPrice += menuItem.getPrice();
        }
        return totalPrice - person.getBonus();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
