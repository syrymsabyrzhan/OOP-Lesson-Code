package WEEK1;

public class Main {
    public static void main(String[] args) {
        Employee secondEmployee = new Employee("Mika", 35, 100, "Kitchen");

        System.out.println(secondEmployee.toString());

        System.out.println(secondEmployee.getSalary());
        System.out.println(secondEmployee.getBonus());

        Table firstTable = new Table(secondEmployee);
        System.out.println(firstTable.getEmployee().getName());
    }
}