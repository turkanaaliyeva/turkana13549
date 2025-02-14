import java.util.Arrays;

public class TeachingAssistant extends Staff {
    private String[] assignedCourses;
    private int courseCount;
    private static final int MAX_COURSES = 10;
    private Professor supervisor;

    public TeachingAssistant(String name, String department, double salary, String email, String phoneNumber, String officeNumber, Professor supervisor) {
        super(name, department, salary, "Active", "Teaching Assistant", email, phoneNumber, officeNumber);
        this.supervisor = supervisor;
        this.assignedCourses = new String[MAX_COURSES];
        this.courseCount = 0;
    }

    public void assignToCourse(String course) {
        if (courseCount < MAX_COURSES) {
            for (int i = 0; i < courseCount; i++) {
                if (assignedCourses[i].equals(course)) {
                    System.out.println(this.getName() + " is already assigned to " + course);
                    return;
                }
            }
            assignedCourses[courseCount++] = course;
            System.out.println(this.getName() + " has been assigned to assist with the course: " + course);
        } else {
            System.out.println("Cannot assign more courses. Maximum limit reached.");
        }
    }

    public void removeFromCourse(String course) {
        for (int i = 0; i < courseCount; i++) {
            if (assignedCourses[i].equals(course)) {
                assignedCourses[i] = assignedCourses[courseCount - 1]; // Replace with last element
                assignedCourses[courseCount - 1] = null; // Nullify last element
                courseCount--;
                System.out.println(this.getName() + " has been removed from assisting with the course: " + course);
                return;
            }
        }
        System.out.println(this.getName() + " was not assigned to " + course);
    }

    public String[] getAssignedCoursesArray() {
        return Arrays.copyOf(assignedCourses, courseCount);
    }

    public void holdOfficeHours() {
        System.out.println(this.getName() + " is holding office hours.");
    }

    public void conductLab(String labName) {
        System.out.println(this.getName() + " is conducting the lab session: " + labName);
    }

    public void gradeStudent(Student student, double grade) {
        System.out.println(this.getName() + " (TA) graded student " + student.getName() + " with " + grade);
    }

    @Override
    public String toString() {
        return "Teaching Assistant: " + getName() + "\n" +
               "Department: " + getDepartment() + "\n" +
               "Salary: $" + getSalary() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Phone Number: " + getPhoneNumber() + "\n" +
               "Office Number: " + getOfficeNumber() + "\n" +
               "Supervisor: " + (supervisor != null ? supervisor.getName() : "None") + "\n" +
               "Assigned Courses: " + (courseCount > 0 ? String.join(", ", Arrays.copyOf(assignedCourses, courseCount)) : "None") + "\n";
    }
}
