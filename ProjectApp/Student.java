
import java.util.ArrayList;
public class Student{
    private String name;
    private int id;
    private float gpa;
    private int age;
    private String email;
    private ArrayList<Course> courses;



    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public Student(String name, int id, float gpa, int age, String email){
        this.name = name;
        this.id = id;
    }

    public void GetStudentInfo(){
        System.out.println("Name: " + this.name +
        "\nId: " + this.id +
        "\nGPA: " + this.gpa +
        "\nAge: " + this.age +
        "\nEmail: " + this.email);
        System.out.println("Courses: ");
        
        or (var course : this.courses) {
            System.out.println("\n_________________\n");
            course.GetCourse();
            
        }
}
    
    public boolean AddCourse(Course course){
        boolean checker = this.courses.add(course);
        if(checker){
            System.out.println("Course added succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;

    }
    public boolean withdrawFromCourse(int id){
        boolean checker = this.courses.removeIf((course)-> course.getId() == id);
        if(checker){
            System.out.println("Course deleted succcesfully!!");
            return checker;
        }
        System.err.println("Error occured((");
        return checker;
    }
    public float CalculateGPA(){
        int size = this.courses.size();
        float overallGpa = 0;
        for (Course course : this.courses) {
            overallGpa += course.findValue();
        }
        overallGpa = overallGpa / (float) size;
        return overallGpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
