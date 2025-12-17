package WEEK2.BDA2513;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("Besh", 500, "Traditional", true);
        MenuItem menuItem2 = new MenuItem("Lagman", 300, "Eastern", true);
        MenuItem menuItem3 = new MenuItem("Cola", 100, "Drinks", true);
        Customer customer = new Customer("Bek", 250);

        Order order = new Order(customer);
        order.getMenuItems().add(menuItem1);
        order.getMenuItems().add(menuItem3);
        System.out.println(order.getTotalPrice());
        System.out.println(order.getTotalPriceWithBonuses());

    }
}
