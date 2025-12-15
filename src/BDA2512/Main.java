package BDA2512;

public class Main {
    public static void main(String[] args) {
        MenuItem mt1 = new MenuItem("Pasta", 500, "Italian", true);
        MenuItem mt = new MenuItem("Cola", 150, "Drinks", true);
        Order order = new Order("Dostan");

        order.addMenuItem(mt);
        order.addMenuItem(mt1);
        System.out.println(order.calculateTotalPrice());
    }
}
