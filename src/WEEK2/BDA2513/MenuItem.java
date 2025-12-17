package WEEK2.BDA2513;

public class MenuItem {
    private String name;
    private int price;
    private String category;
    private boolean isAvailable;

    public MenuItem(String name, int price, String category, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public MenuItem() {}


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
