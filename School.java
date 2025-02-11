class School {
    String name;
    String program;
    int totalStudents;
    String headOfDepartment;
    String campus; 

    School(String name, String[] programs, int totalStudents, String headOfDepartment, String campus) {
        this.name = name;
        this.program = program;
        this.totalStudents = totalStudents;
        this.headOfDepartment = headOfDepartment;
        this.campus = campus;
    }

    public void displayInfo() {
        System.out.println("School: " + name);
        System.out.println("Program: " + program);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Head of Department: " + headOfDepartment);
        System.out.println("Campus: " + campus);  
    }

}
