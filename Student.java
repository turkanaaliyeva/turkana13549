import java.util.*;
public class Student extends People{
    // fields
    private float GPA;
    private academicDetails acInfo;
    private ArrayList<Course> takenCourses;

    // constructors
    public Student(String fullName, String gender, String phone, Email email, int age, int ID, Date dateOfBirth, float GPA, academicDetails acInfo){
        super(fullName, gender, phone, email, age, ID, dateOfBirth);
        this.GPA = GPA;
        this.acInfo = acInfo;
        takenCourses = new ArrayList<Course>();
    }

    //getter methods
    public float getGPA() {
        return GPA;
    }
    public academicDetails getAcInfo() {
        return acInfo;
    }
    public ArrayList<Course> getTakenCourses() {
        return takenCourses;
    }

    // setter methods
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public void setAcInfo(academicDetails acInfo) {
        this.acInfo = acInfo;
    }

    // methods
    public void addCourse(Course newCourse){
        takenCourses.add(newCourse);
    }
    public void withdrawCourse(Course course){
        takenCourses.remove(takenCourses.indexOf(course));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + acInfo.toString() + "\nGPA: " + GPA + "\nNumber of Taken Courses: " + takenCourses.size(); 
    }

    public static void main(String[] args){
        Student Khizri = new Student("Khizri Sakhrayev", "Male", "0555555555", new Email("ksakhrayev20578@ada.edu.az", "111"), 19, 20578, new Date(20, 2, 2006), 3.86f, new academicDetails("Undergraduate", "BS in Computer Science", "IT and Engineering", "Computer Science", 2024));
        Course PP2 = new Course("PP2", 6, 20309, new People("Ismayil Shahaliyev", "Male", 0, null));
        Khizri.addCourse(PP2);
        System.out.println(Khizri);
    }
}