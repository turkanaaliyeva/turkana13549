package model.person;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private String department;
    private String position;
    private LocalDate hireDate;

    public Employee(int id, String fullName, String address, String phone, String email, LocalDate dateOfBirth, 
                    double salary, String department, String position, LocalDate hireDate) {
        super(id, fullName, address, phone, email, dateOfBirth);
        this.salary = salary;
        this.department = department;
        this.position = position;
        this.hireDate = hireDate;
    }

    public double getSalary() { return salary; }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public LocalDate getHireDate() { return hireDate; }

    public void setSalary(double salary) { this.salary = Math.max(salary, 0.0); }
    public void setDepartment(String department) { this.department = department; }
    public void setPosition(String position) { this.position = position; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

    @Override
    public String toString() {
        return super.toString() + 
               "\nPosition: " + position +
               "\nDepartment: " + department +
               "\nHire Date: " + hireDate +
               "\nSalary: $" + salary;
    }
}
