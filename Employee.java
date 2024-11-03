public class Employee {
    private String id;
    private String name;
    private int salary;

    // Default constructor
    public Employee() {
    }

    // Build in constructor
    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Setter & getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Extra helpful methods
    public int getAnnualSalary(){
        return salary * 12; // Multiplying the monthly salary by 12.
    }

    public int raisedSalary(int percent){
        salary = salary + (int)(salary * (percent / 100.0)); // Increase monthly salary by the percentage
        return salary;
    }

    // toString() method
    @Override
    public String toString() {
        return "\nEmployee id: " + id +
                "\nEmployee name: " + name +
                "\nEmployee salary: " + salary +
                "\n------------------------------------";
    }
}
