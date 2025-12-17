package WEEK1.IT2502;

public class Courier {
    private String name;
    private int id;

    public Courier(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
