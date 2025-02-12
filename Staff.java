
public class Staff {
    // Fields
    private double salary;
    private String phoneNumber;

    // Public fields
    public String status;
    public String role;
    public String email;
    public String officeNumber;
    public String name;
    public String department;


    public Staff(String name, String department) {
        this.name = name;
        this.department = department;
        this.salary = 0.0;            // Default salary
    }

    public Staff(String name, String department, double salary, String role, String status) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.role = role;
        this.status = status;

    }

    public Staff(String name, String department, double salary, String status, String role, 
                 String email, String phoneNumber, String officeNumber) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.status = status;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.officeNumber = officeNumber;
    }

    public double getSalary() {
        if (salary <= 0) {
            System.out.println("Error: Salary must be set to a positive value.");
            return -1; 
        }
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary must be positive.");
            return; 
        }
        this.salary = salary;
    }

    // Phone Number
    public String getPhoneNumber() {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            System.out.println("Error: Phone number has not been set yet.");
            return null; 
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() < 10) {
            System.out.println("Error: Phone number must be at least 10 characters.");
            return; // Do nothing, prevent the operation
        }
        this.phoneNumber = phoneNumber;
    }

    // Name
    public String getName() {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: Name has not been set yet.");
            return null; // Return null or any default value as needed
        }
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: Name cannot be null or empty.");
            return; 
        }
        this.name = name;
    }

    // Department
    public String getDepartment() {
        if (department == null || department.isEmpty()) {
            System.out.println("Error: Department has not been set yet.");
            return null; 
        }
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            System.out.println("Error: Department cannot be null or empty.");
            return; // Do nothing, prevent the operation
        }
        this.department = department;
    }

   

    // Status
    public void setStatus(String status) {
        if (status == null || status.isEmpty()) {
            System.out.println("Error: Status cannot be null or empty.");
            return; // Do nothing, prevent the operation
        }
        this.status = status;
    }

    // Role
    public void setRole(String role) {
        if (role == null || role.isEmpty()) {
            System.out.println("Error: Role cannot be null or empty.");
            return; // Do nothing, prevent the operation
        }
        this.role = role;
    }

    // Email
    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            System.out.println("Error: Invalid email format.");
            return; // Do nothing, prevent the operation
        }
        this.email = email;
    }

    // Office Number
    public void setOfficeNumber(String officeNumber) {
        if (officeNumber == null || officeNumber.isEmpty()) {
            System.out.println("Error: Office number cannot be null or empty.");
            return; // Do nothing, prevent the operation
        }
        this.officeNumber = officeNumber;
    }
}