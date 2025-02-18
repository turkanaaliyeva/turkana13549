public class Person extends Object {
    // fields
    private String fullName;
    private String phone;
    private Email email;
    private int ID;
    private int age;
    private Date dateOfBirth;
    private String address;

    // constructors
    public Person(String fullName, String address, String phone, Email email, int age, int ID, Date dateOfBirth){
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String fullName, String address, int age, Email email){
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.email = email;
    }

    // getter methods
    public String getFullName(){
        return fullName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public Email getEmail() {
        return email;
    }
    public int getAge(){
        return age;
    }
    public int getID(){
        return ID;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    // setter methods
    public void setFullName(String newFullName){
        fullName = newFullName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(Email email) {
        this.email = email;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setID(int newID){
        ID = newID;
    }
    public void setDateOfBirth(Date newDateOfBirth){
        dateOfBirth = newDateOfBirth;
    }

    @Override
    public String toString() {
        String info = "Full Name: " + fullName + "\nAge: " + age + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail: " + email.getEmail() + "\nID: " + ID + "\nDate of Birth: " + dateOfBirth.getDate();
        return info;
    }
}