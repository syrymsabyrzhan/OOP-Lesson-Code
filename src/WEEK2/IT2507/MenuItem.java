package WEEK2.IT2507;

public class MenuItem {
    private String name; // Besh
    private double price; // 5000$
    private String category;
    private boolean isAvailable;

    public MenuItem() {
        isAvailable = true;
    }

    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
