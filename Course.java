import java.util.Arrays;

public class Course {
    String title;
    int passingGrade;
    int CRN;
    Course[] prerequisites = null;
    public Course(String title, int passingGrade, int cRN) {
        this.title = title;
        this.passingGrade = passingGrade;
        CRN = cRN;
    }
    
    @Override
    public String toString() {
        return "Course [title=" + title + ", passingGrade=" + passingGrade + ", CRN=" + CRN + ", prerequisites="
                + Arrays.toString(prerequisites) + "]";
    }

    
}
