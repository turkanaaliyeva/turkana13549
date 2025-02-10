import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student("Ismayil", 123),
            new Student("John", 1234),
            new Student("Jack", 1236)
        };
        String name = students[0].getName();
        StringBuilder sb = new StringBuilder(name);
        students[0].setName(sb.reverse().toString());
        System.out.println(students[0].getName());
    }
}
