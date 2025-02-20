package model;
import java.util.Date;

public abstract class Person {

    private String fullName;
    private String phone;
    private String email;
    private int id;
    private int age;
    private Date dateOfBirth;
    private String address;

    public Person(String fullName, String address, String phone, String email, int id, int age, Date dateOfBirth2) {

        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.id = id;
        this.dateOfBirth = dateOfBirth2;
    }

 

    public Person(String fullName, String email, int id, int age) {
        this.fullName = fullName;
        this.email = email;
        this.id = id;
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

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    @Override
    public String toString() {
        return "Person [fullName=" + fullName + ", phone=" + phone + ", email=" + email + ", id=" + id + ", age=" + age
                + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
    }
    

    }

