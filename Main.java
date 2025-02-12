public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course("PP2", "Java programming course", 1202, 6, 45, 'D');
        course.addCourse("PP1", "C programming course", 1202, 6, 40, 'D');
        System.out.println(course);
    }
}
