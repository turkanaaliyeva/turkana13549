public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("30021", "Mete", "Keskin", "mkeskin@ait.edu", "421", "Information", "Assistant Professor", "I201", "03-01-2023", false);
        f1.changeAvailabilityStatus(true);
        f1.displayFacultyInfo();
        f1.assignCourse("Introduction to Computer Science");
    }
}
