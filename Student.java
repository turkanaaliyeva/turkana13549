public class Student {
    
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double gpa;

   
    public Student(String studentId, String firstName, String lastName, int age, String email, String phoneNumber, double gpa) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }
    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;   
    }

    public Student(String studentId, String firstName, String lastName, int age, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;   
    }
    public Student(String studentId, String firstName, String lastName, int age, String email, String phoneNumber) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email; 
        this.phoneNumber = phoneNumber;  
    }
   
    public String getStudentId() {
        return studentId;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) { 
            this.gpa = gpa;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getFirstName()); 
        System.out.println("Surname " + getLastName());
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("GPA: " + gpa);
        System.out.println("Honor Student: " + (isHonorStudent() ? "Yes" : "No"));
    }
}
