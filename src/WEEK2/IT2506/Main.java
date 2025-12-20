package WEEK2.IT2506;

public class Main {
    public static void main(String[] args) {
        MenuItem dish1 = new MenuItem("Besh", 3000, "Traditional");
        MenuItem dish2 = new MenuItem("Lagman", 2500, "Eastern");
        MenuItem dish3 = new MenuItem("Cola", 500, "Drinks");

        Customer customer1 = new Customer("Dos", 500);

        Order order1 = new Order(customer1);
        order1.getMenuItems().add(dish1);
        order1.getMenuItems().add(dish3);

        System.out.println(order1.getTotalPrice());
        System.out.println(order1.getTotalPriceWithBonus());
    }
}
