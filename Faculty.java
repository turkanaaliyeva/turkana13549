import java.util.ArrayList;

public class Faculty {
    private String facultyID;
    private String firstName;
    private String secondName;
    private String email;
    private String phoneNumber;
    private String department;
    private String position;
    private String officeLocation;
    private String hireDate;
    private boolean availability;

    private ArrayList<String> coursesTaught;

    public Faculty(String facultyID, String firstName, String secondName, String email, String phoneNumber,
            String department, String position, String officeLocation, String hireDate, boolean availability) {
        this.facultyID = facultyID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.position = position;
        this.officeLocation = officeLocation;
        this.hireDate = hireDate;
        this.availability = availability;
        this.coursesTaught = new ArrayList<>();
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public String getFacultyID() {
        return facultyID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public String getHireDate() {
        return hireDate;
    }

    public boolean setAvailability() {
        return availability;
    }


    public void displayFacultyInfo() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Name: " + firstName + " " + secondName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Office Location: " + officeLocation);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
        System.out.println("-------------------------------------------------------------------");
    }

    public void changeAvailabilityStatus(boolean status){
        this.availability = status;
        if(availability == true){
            System.out.printf("%s %s %s is now available\n", this.position, this.firstName, this.secondName);
        }
        else{
            System.out.printf("%s %s %s is now available\n", this.position, this.firstName, this.secondName);
        }
    }
    public void assignCourse(String courseName) {
        if (!coursesTaught.contains(courseName)) {
            coursesTaught.add(courseName);
            System.out.println("\"" + courseName + "\" has been assigned to " + this.firstName + " " + this.secondName);
        } else {
            System.out.println(this.firstName + " " + this.secondName + " is already assigned to \"" + courseName+"\"");
        }
    } 
}