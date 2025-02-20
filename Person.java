import java.util.Date;

public class Person {

    private String fullName;
    private String phone;
    private String email;
    private int ID;
    private int age;
    private Date dateOfBirth;
    private String address;

    public Person(String fullName, String address, String phone, String email, int ID, int age, Date dateOfBirth2) {

        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth2;
    }

 

    public Person(String fullName, String email, int ID, int age) {
        this.fullName = fullName;
        this.email = email;
        this.ID = ID;
        this.age = age;
    }



    public String getFullName() {
        return fullName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    @Override
    public String toString() {
        return "Person [fullName=" + fullName + ", phone=" + phone + ", email=" + email + ", ID=" + ID + ", age=" + age
                + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
    }

    // Main method 
    public static void main(String[] args) {
        // Person objects
        Person person1 = new Person("Ziyaddin Musayev", "123 Street", "050-050-050", "m.ziyaddin1@gmail.com", 101, 25, new Date());
        Person person2 = new Person("Turan Musayev", "turanmusayev@gmail.com", 102, 30);

        //Using getters to retrieve and print the details:
        System.out.println("--------------------");
        System.out.println("Person 1 details:");
        System.out.println("Full name: " + person1.getFullName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone: " + person1.getPhone());
        System.out.println("Email: " + person1.getEmail());
        System.out.println("ID: " + person1.getID());
        System.out.println("Age " + person1.getAge());
        System.out.println("Date of Birth " + person1.getDateOfBirth());
        System.out.println("--------------------");

        // Using setters to update details:
        person1.setPhone("555-555-55-55");
        person1.setAddress("555 Avenue");
        person1.setAge(19);
        System.out.println("-----");
        System.out.println("Updated Person 1 details:");
        System.out.println(person1);
        System.out.println("-----");

        System.out.println();

        //Displaying Person 2 details:
        System.out.println("--------------------");
        System.out.println("Person 2 Details:");
        System.out.println("Full name: " + person2.getFullName());
        System.out.println("Email: " + person2.getEmail());
        System.out.println("ID: " + person2.getID());
        System.out.println("Age: " + person2.getAge());
        System.out.println("--------------------");

        // Using setters to update details:
        System.out.println("-----");
        person2.setAge(20);
        person2.setID(0505);
        System.out.println("Updated Person 2 Details:");
        System.out.println(person2);
        System.out.println("-----");



    }
}

