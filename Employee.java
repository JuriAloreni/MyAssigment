public class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name, int age, int number, String department, double salary) {
        super(name, age, number);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    
}
