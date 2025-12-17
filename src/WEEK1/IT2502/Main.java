package WEEK1.IT2502;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem();

        menuItem1.setName("Besh");
        menuItem1.setCategory("National");
        menuItem1.setPrice(5000);
        menuItem1.setAvailable(true);

        System.out.println(menuItem1);

        MenuItem menuItem2 = new MenuItem("Lagman", "East", 2500,true);
        MenuItem menuItem3 = new MenuItem("Cola", "Drinks", 500,true);
        System.out.println(menuItem2);

        Courier courier1 = new Courier("CJ", 0);

        Order order1 = new Order();
        order1.setCourier(courier1);
        order1.getMenuItems().add(menuItem1);
        order1.getMenuItems().add(menuItem2);
        order1.getMenuItems().add(menuItem3);

        System.out.println(order1);
        System.out.println(order1.getTotalPrice());

    }
}
