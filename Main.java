import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Program p = new Program("Computer Science", 
                                new Faculty(123, "Samir", "Rustamov"), 
                                new Course[]{
                                    new Course("CSCI 1202", 60, 20309),
                                    new Course("CSCI 1202", 60, 20308)
                                });
        System.out.println(p);
    }
}
