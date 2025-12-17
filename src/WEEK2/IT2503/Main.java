package WEEK2.IT2503;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("Besh",500, "Traditional", true);
        MenuItem menuItem2 = new MenuItem("Lagman",200, "East", true);
        MenuItem menuItem3 = new MenuItem("Cola",100, "Drinks", true);
        Person person1 = new Person("Bek", 500);
        Order order1 = new Order(0, person1);
        order1.getMenuItemList().add(menuItem1);
        order1.getMenuItemList().add(menuItem3);

        System.out.println(order1.getTotalPrice());
        System.out.println(order1.getTotalCostWithBonus());
    }
}
