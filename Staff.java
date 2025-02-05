public class Staff {
    // Private fields (Encapsulation)
    private String name;
    private int id;
    private String department;
    private double salary;

    public Staff(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Public Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        if (id > 0) { // Ensuring valid ID
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary >= 0) { 
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. It must be non-negative.");
        }
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
