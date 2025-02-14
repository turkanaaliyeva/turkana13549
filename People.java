public class People {
    // fields
    private String fullName;
    private String gender;
    private String phone;
    private String email;
    private int Id;
    private int age;
    private Date dateOfBirth;

    public People(String fullName, String gender, String phone, String email, int Id, int age, Date dateOfBirth) {
        this.fullName = fullName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.Id = Id;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public People(String fullName, int Id, int age, String email) {
        this.fullName = fullName;
        this.email = email;
        this.Id = Id;
        this.age = age;
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
  
    public int getAge(){
        return age;
    }
    public int getId(){
        return Id;
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
   
    public void setAge(int age){
        this.age = age;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public void setDateOfBirth(Date newDateOfBirth){
        dateOfBirth = newDateOfBirth;
    }

    @Override
    public String toString() {
        String info = "Full Name: " + fullName + "\nAge: " + age + "\nGender: " + gender + "\nPhone number: " + phone + "\nEmail: " +email + "\nId: " + Id + "\nDate of Birth: " + dateOfBirth.getDate();
        return info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
