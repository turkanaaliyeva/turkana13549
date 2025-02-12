import java.util.Arrays;

public class Program extends Object {
    private String title;
    private Faculty programDirector;
    private Course[] courses;

    public Program(String title, Faculty programDirector, Course[] courses) {
        this.title = title;
        this.programDirector = programDirector;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Program [title=" + title + ", programDirector=" + programDirector + ", courses="
                + Arrays.toString(courses) + "]";
    } 

}
