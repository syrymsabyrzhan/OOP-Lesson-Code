package WEEK2.IT2507;

public class Main {
    public static void main(String[] args) {
        MenuItem dish1 = new MenuItem("Besh", 250, "National");
        MenuItem dish2 = new MenuItem("Cola", 50, "Drinks");
        MenuItem dish3 = new MenuItem("Lagman", 150, "Eastern");
        Customer customer1 = new Customer("Dos", 20, 500);
        Order order1 = new Order(customer1);
        order1.getMenuItems().add(dish1);
        order1.getMenuItems().add(dish2);

        System.out.println(order1.getTotalPrice());
        System.out.println(order1.getTotalPriceWithBonus());
    }
}
