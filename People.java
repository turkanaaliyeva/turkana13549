public class People {
    // fields
    private String fullName;
    private String gender;
    private String phone;
    private Email email;
    private int ID;
    private int age;
    private Date dateOfBirth;

    // constructors
    public People(String fullName, String gender, int age, Email email){
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    public People(String fullName, String gender, String phone, Email email, int age, int ID, Date dateOfBirth){
        this.fullName = fullName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
    }
    // getter methods
    public String getFullName(){
        return fullName;
    }
    public String getGender() {
        return gender;
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
    public void setGender(String gender) {
        this.gender = gender;
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
        String info = "Full Name: " + fullName + "\nAge: " + age + "\nGender: " + gender + "\nPhone number: " + phone + "\nEmail: " + email.getEmail() + "\nID: " + ID + "\nDate of Birth: " + dateOfBirth.getDate();
        return info;
    }
    
}
