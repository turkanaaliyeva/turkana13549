import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        AdminService adminService = new AdminService(studentService);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Welcome, Admin!");
            while (true) {
                 System.out.println("1. Add Course");
                System.out.println("2. Add Student");
                System.out.println("3. Remove Student");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                if (choice == 1) {
                    adminService.addCourse();

                }
                else if(choice == 2){
                    adminService.addStudent();
                }
                else if (choice == 3) {
                    System.out.print("Enter student ID to remove: ");
                    int id = scanner.nextInt();
                    adminService.removeStudent(id);
                } else if (choice == 4) {
                    break;
                }
            }
        } else {
            System.out.println("Welcome, Student!");
            while (true) {
                
                System.out.println("1. Print Student Info");
                System.out.println("2. Enroll in Course");
                System.out.println("3. Withdraw from Course");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                
                if (choice == 1) {
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    studentService.printStudentInfo(id);
                } else if (choice == 2) {
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    studentService.enrollStudentInCourse(id);
                } else if (choice == 3) {
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter course ID to withdraw: ");
                    int courseId = scanner.nextInt();
                    studentService.withdrawStudentFromCourse(id, courseId);
                
                } else if (choice == 4) {
                    break;
                }
            }
        }
        scanner.close();
    }
}
