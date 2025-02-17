import java.lang.reflect.Array;
import java.util.*;

public class Staff extends Person{
    private double salary;
    public String status, role, officeNumber, department;
    private ArrayList<Room> assignedRooms;
    
    //constructors
    public Staff(String fullName, String gender, String phone, Email email, int age, int ID, Date dateOfBirth,
            double salary, String status, String role, String officeNumber, String department,
            ArrayList<Room> assignedRooms) {
        super(fullName, gender, phone, email, age, ID, dateOfBirth);
        this.salary = salary;
        this.status = status;
        this.role = role;
        this.officeNumber = officeNumber;
        this.department = department;
        this.assignedRooms = assignedRooms;
    }

    public Staff(String fullName, String gender, int age, Email email, String status, String role, String department) {
        super(fullName, gender, age, email);
        this.status = status;
        this.role = role;
        this.department = department;
    }

    public Staff(String fullName, String gender, String phone, Email email, int age, int ID, Date dateOfBirth,
            double salary, String status, String role, String department) {
        super(fullName, gender, phone, email, age, ID, dateOfBirth);
        this.salary = salary;
        this.status = status;
        this.role = role;
        this.department = department;
    }

    // getter and setter methods

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

    // Office Number
    public void setOfficeNumber(String officeNumber) {
        if (officeNumber == null || officeNumber.isEmpty()) {
            System.out.println("Error: Office number cannot be null or empty.");
            return; // Do nothing, prevent the operation
        }
        this.officeNumber = officeNumber;
    }
    public String getOfficeNumber(){
        return officeNumber;
    }

    public void assignRoom(Room room) {
        if (room != null && !assignedRooms.contains(room)) {
            assignedRooms.add(room);
            System.out.println("Room " + room.getID() + " assigned to " + getFullName());
        } else {
            System.out.println("Error: Room is either null or already assigned.");
        }
    }

    // **Method to Remove a Room Assignment**
    public void removeRoom(Room room) {
        if (assignedRooms.contains(room)) {
            assignedRooms.remove(room);
            System.out.println("Room " + room.getID() + " removed from " + getFullName());
        } else {
            System.out.println("Error: Room not found in assigned rooms.");
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(super.toString());
        info.append("\nStatus: " + status);
        info.append("\nRole: " + role);
        info.append("\nOffice Number: " + officeNumber);
        info.append("\nDepartment: " + department);
        info.append("\nSalary: " + salary);
        info.append("\nNumber of Assigned Rooms: " + assignedRooms.size());
        String infoString = info.toString();
        return infoString;
    }


}