package WEEK2.IT2507;

public class Customer {
    private String name;
    private int age;
    private double bonus;

    public Customer(String name, int age, double bonus) {
        this.name = name;
        this.bonus = bonus;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
