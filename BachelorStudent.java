import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BachelorStudent extends Student {
    private String thesisTitle;
    private boolean internshipCompleted;

    

    

    public BachelorStudent(String fullName, String address, String phone, String email, int ID, int age,
            Date dateOfBirth2, double cgpa, String major, ArrayList<Student.Course> courses, boolean onProbation,
            double[] gpas, int semester, double[] semesterGPAs, String[] completedCourses, String[] instructors,
            int coursesCovered, String thesisTitle, boolean internshipCompleted) {
        super(fullName, address, phone, email, ID, age, dateOfBirth2, cgpa, major, courses, onProbation, gpas, semester,
                semesterGPAs, completedCourses, instructors, coursesCovered);
        this.thesisTitle = thesisTitle;
        this.internshipCompleted = internshipCompleted;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public boolean isInternshipCompleted() {
        return internshipCompleted;
    }

    public void setInternshipCompleted(boolean internshipCompleted) {
        this.internshipCompleted = internshipCompleted;
    }

   


    @Override
    public String toString() {
        return "BachelorStudent [thesisTitle=" + thesisTitle + ", internshipCompleted=" + internshipCompleted
                + ", getFullName()=" + getFullName() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
                + ", getThesisTitle()=" + getThesisTitle() + ", getEmail()=" + getEmail() + ", getAge()=" + getAge()
                + ", getID()=" + getID() + ", isInternshipCompleted()=" + isInternshipCompleted()
                + ", getDateOfBirth()=" + getDateOfBirth() + ", calculateGPA()=" + calculateGPA() + ", getClass()="
                + getClass() + ", isHonorStudent()=" + isHonorStudent() + ", getCgpa()=" + getCgpa() + ", getMajor()="
                + getMajor() + ", isOnProbation()=" + isOnProbation() + ", getGpas()=" + Arrays.toString(getGpas())
                + ", getSemester()=" + getSemester() + ", getSemesterGPAs()=" + Arrays.toString(getSemesterGPAs())
                + ", hashCode()=" + hashCode() + ", getCompletedCourses()=" + Arrays.toString(getCompletedCourses())
                + ", getInstructors()=" + Arrays.toString(getInstructors()) + ", getCoursesCovered()="
                + getCoursesCovered() + ", toString()=" + super.toString() + "]";
    }

    public static void main(String[] args) {
        System.out.println("h");
    }
}
