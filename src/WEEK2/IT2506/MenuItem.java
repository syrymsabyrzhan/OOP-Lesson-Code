package WEEK2.IT2506;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private boolean isAvailable;

    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
        isAvailable = true;
    }

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
        category = "Default";
        isAvailable = true;
    }

    public MenuItem () {
        isAvailable = true;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
