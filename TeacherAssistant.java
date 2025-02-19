public class TeacherAssistant extends Student {
    private String courseAssigned;

    public TeacherAssistant(String name, int age, int id, String major, String courseAssigned) {
        super(name, age, id, major);
        this.courseAssigned = courseAssigned;
    }

    @Override
    public String toString() {
        return super.toString() + ", Assigned Course: " + courseAssigned;
    }
}
