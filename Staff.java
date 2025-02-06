public class Staff {
    private String name;
    private String job;
    private long salary;
    private int hoursWorked;

    // Constructor: ↓
    public Staff(String name, String job, long salary, int hoursWorked) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    // Getters: ↓
    public String getName() { return name; }
    public String getJob() { return job; }
    public long getSalary() { return salary; }
    public int getHoursWorked() { return hoursWorked; }

    // Setters ↓
    public void setSalary(long salary) { this.salary = salary; }
    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }

    // Method ↓
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: $" + salary);
        System.out.println("Hours Worked: " + hoursWorked + " hours\n");
    }

    // Main method ↓
    public static void main(String[] args) {
        // Creating Staff objects
        Staff staff1 = new Staff("Orkhan Sharifov", "Programmer", 100000, 50);
        Staff staff2 = new Staff("Halima Orujova", "Designer", 70000, 40);
        Staff staff3 = new Staff("Turan Hajiyev", "Manager", 80000, 45);
        Staff staff4 = new Staff("Zahra Guliyeva", "HR", 60000, 30);

        // Displaying staff details ↓
        System.out.println();
        staff1.displayDetails();
        staff2.displayDetails();
        staff3.displayDetails();
        staff4.displayDetails();

        // Updating salary or time of Staff ↓
        staff1.setSalary(150000);
        staff1.setHoursWorked(60);
        
        System.out.println();
        System.out.println("Updated data of staff:");
        System.out.println();
        staff1.displayDetails();
    }
}