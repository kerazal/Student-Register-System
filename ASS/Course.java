package ASS;

import java.util.Scanner;

public class Course extends Main {

//    The provided code is a Java class named Course that extends the Main class.
//    It contains various methods and variables related to a student's course information.
//    Let's go through the code and add comments to explain its functionality.

    Scanner input = new Scanner(System.in);
    public int getDepartment(int department) {
        return Integer.parseInt(String.valueOf(Dep.department));
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public String getSemester() {
        return String.valueOf((semester));
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }

    private int day;
    private int type;
    private String firstName;
    private String lastName;
    private String sex;
    static int department;
    public int semester;
    private String year;
    private String studentType;
    private static String id;
    private String uid;
    //    This section imports the necessary packages and declares the class Course, which extends the Main class.
//    It also initializes a Scanner object for user input and declares various instance variables related to student information.
    public void Student() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.department = department;
        this.year = year;
        this.type=type;
        this.id=id;
        this.uid=uid;

        {
// Comment: This block of code checks the department value and prints the corresponding courses for the semester.
            getDepartment(department);

            if (getDepartment(department)==1) {
// Comment: If the department is 1, it means it is the Software Engineering department.
                System.out.println("SOFTWARE ENGINERING");
                System.out.println("Courses for this Semester Are listed Below: ");
                System.out.println("1. Object-Oriented Programming");
                System.out.println("2. Data Structures and Algorithms");
                System.out.println("3. Programming Fundamentals");
                System.out.println("4. Database Systems");
                System.out.println("5. Computer Networks");

            } else if (getDepartment(department)==2) {
// Comment: If the department is 2, it means it is the Computer Science department.
                System.out.println("COMPUTER SCIENCE");
                System.out.println("Courses for this Semester Are listed Below: ");
                System.out.println("1. Artificial Intelligence");
                System.out.println("2. Data Science");
                System.out.println("3. Object-Oriented Programming");
                System.out.println("4. Database Systems");
                System.out.println("5. Computer Networks");

            } else if (getDepartment(department)==3) {
// Comment: If the department is 3, it means it is the Information Technology department.
                System.out.println("INFORMATION TECHNOLOGY");
                System.out.println("Courses for this Semester Are listed Below: ");
                System.out.println("1. Programming Fundamentals");
                System.out.println("2. Applied maths");
                System.out.println("3. Object-Oriented Programming");
                System.out.println("4. Database Systems");
                System.out.println("5. Introduction to data mining");

            } else if (getDepartment(department)==4) {
// Comment: If the department is 4, it means it is the Information Science department.
                System.out.println("INFORMATION SCIENCE");
                System.out.println("Courses for this Semester Are listed Below: ");
                System.out.println("1. Discrete maths");
                System.out.println("2. Computer System");
                System.out.println("3. Object-Oriented Programming");
                System.out.println("4. Database Systems");
                System.out.println("5. Computer Networks");

            } else if (getDepartment(department)==5) {
// Comment: If the department is 5, it means it is the Information System department.
                System.out.println("INFORMATION SYSTEM");
                System.out.println("Courses for this Semester Are listed Below: ");
                System.out.println("1. Basic of Information system");
                System.out.println("2. Introduction to Statistics ");
                System.out.println("3. Object-Oriented Programming");
                System.out.println("4. Database Systems");
                System.out.println("5. Programming Fundamentals");

            } else if (getDepartment(department)==6) {
// Comment: If the department is 6, it means it is the Statistics department.
                System.out.println("STATISTICS");
                System.out.println("Courses for this Semester Are listed Below: ");
                System.out.println("1. Basic Statistics");
                System.out.println("2. Data Structures and Algorithms ");
                System.out.println("3. Object-Oriented Programming");
                System.out.println("4. Statistics with Python");
                System.out.println("5. PIntroduction to Statistics");
            } else {
                String n = "please select your department from listed dep";
            }
        }

    }
}