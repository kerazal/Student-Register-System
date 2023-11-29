package ASS;

import java.util.Scanner;

public class Dep extends Course {

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public int getDepartment(int department) {

        return Dep.department;
    }

    public void setDepartment(int department) {
        this.department = department;

    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    private String day;
    private int type;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    private String lastName;
    private String sex;
    static int department;
    private String semester;
    private String year;
    private String studentType;

    private String id;
    private String uid;

    public String D() {
        Scanner input = new Scanner(System.in);


        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.department = department;
        this.year = year;
        this.type = type;
        this.id = id;
        this.uid = uid;
        this.studentType=studentType;
        System.out.println("\n                          Registered successfully\n");
        System.out.println("1.To See All Information Enter 0:");
        System.out.println("2.Enter 1 To Continue Register:");
        System.out.println("3.Enter other to exit");
        int Info=input.nextInt();
        if(Info==0) {
            getDepartment(department);
            if (getDepartment(department) == 1) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                 HARAMAYA UNIVERSITY                                                   |");
                System.out.println("              P.O.BOX: 138,Dire Dawa, Ethiopia. Website: www.haramaya.edu.et                           |");
                System.out.println("       Email: register@haramaya.edu.et, Tel: +251-255-530-313 Fax: +251-255-530-325                    |");
                System.out.println("                Student Registration Slip for Software Engineering                                     ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("College|Institute        | CCI                                    | Issue Datea: " + day + "       ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Program Name:            | " + (studentType == "1" ? "Regular" : "Distance") + " " + "|year: " + year + " |sem: " + semester);
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Department:              | Software Engineering                                                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                          STUDENT REGISTRATION SLIP                                                    |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("ID: " + id + "                                                         " + "| UID: " + uid + "                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Name: " + firstName + " " + lastName + "                                                " + "| Sex: " + sex + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Phone number: +251" + phone + "                                                " + "| Email: " + email + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("# | Courses Title For Software Engineering            |  Course code |   Cr.Hr  |  ECTS | Instractor   |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("1.| Programming Fundamentals                         |   CoSc1012   |    3     |   5   | Dr.A          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("2.| Data Structures and Algorithms                   |   SEng2032   |    4     |   5   | Dr.B          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("3.| Object-Oriented Programming                      |   SEng2081   |    3     |   5   | Dr.C          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("4.| Database Systems                                 |   SEng2021   |    3     |   5   | Dr.D          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("5.| Computer Networks                                |   SEng2019   |    4     |   5   | Dr.E          |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                                              Total: |                            25                   |");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");

            } else if (getDepartment(department) == 2) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                 HARAMAYA UNIVERSITY                                                   |");
                System.out.println("              P.O.BOX: 138,Dire Dawa, Ethiopia. Website: www.haramaya.edu.et                           |");
                System.out.println("       Email: register@haramaya.edu.et, Tel: +251-255-530-313 Fax: +251-255-530-325                    |");
                System.out.println("                Student Registration Slip for computer science                                         |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("College|Institute        | CCI                                    | Issue Datea: " + day + "       ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Program Name:            | " + (studentType == "1" ? "Regular" : "Distance") + " " + "|year: " + year + " |sem: " + semester);
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Department:              | computer science                                                            |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                          STUDENT REGISTRATION SLIP                                                    |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("ID: " + id + "                                                         " + "| UID: " + uid + "                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Name: " + firstName + " " + lastName + "                                                " + "| Sex: " + sex + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Phone number: +251" + phone + "                                                " + "| Email: " + email + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("# | Courses Title4 Computer Science                  |  Course code |   Cr.Hr  |  ECTS | Instractor    |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("1.| Artificial Intelligence                          |   AISc1342   |    4     |   5   | Dr.F          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("2.| Data Science                                     |   DSng2032   |    4     |   7   | Dr.G          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("3.| Object-Oriented Programming                      |   SEng2081   |    3     |   7   | Dr.H          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("4.| Database Systems                                 |   SEng2021   |    3     |   5   | Dr.I          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("5.| Computer Networks                                |   SEng2019   |    4     |   7   | Dr.J          |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                                              Total: |                            31                   |");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
            } else if (getDepartment(department) == 3) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                 HARAMAYA UNIVERSITY                                                   |");
                System.out.println("              P.O.BOX: 138,Dire Dawa, Ethiopia. Website: www.haramaya.edu.et                           |");
                System.out.println("       Email: register@haramaya.edu.et, Tel: +251-255-530-313 Fax: +251-255-530-325                    |");
                System.out.println("                Student Registration Slip for Information Technology                                   |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("College|Institute        | CCI                                    | Issue Datea: " + day + "       ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Program Name:            | " + (studentType == "1" ? "Regular" : "Distance") + " " + "|year: " + year + " |sem: " + semester);
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Department:              | Information Technology                                                      |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                          STUDENT REGISTRATION SLIP                                                    |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("ID: " + id + "                                                         " + "| UID: " + uid + "                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Name: " + firstName + " " + lastName + "                                                " + "| Sex: " + sex + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Phone number: +251" + phone + "                                                " + "| Email: " + email + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("# | Courses Title Information Technology             |  Course code |   Cr.Hr  |  ECTS | Instractor    |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("1.| Programming Fundamentals                         |   CoSc1012   |    5     |   5   | Dr.K          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("2.| Applied maths                                    |   Mthng2024  |    3     |   5   | Dr.L          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("3.| Object-Oriented Programming                      |   SEng2081   |    3     |   5   | Dr.M          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("4.| Database Systems                                 |   SEng2021   |    3     |   5   | Dr.N          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("5.| Introduction to data mining                      |   IDng2034   |    4     |   5   | Dr.O          |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                                              Total: |                            25                   |");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
            } else if (getDepartment(department) == 4) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                 HARAMAYA UNIVERSITY                                                   |");
                System.out.println("              P.O.BOX: 138,Dire Dawa, Ethiopia. Website: www.haramaya.edu.et                           |");
                System.out.println("       Email: register@haramaya.edu.et, Tel: +251-255-530-313 Fax: +251-255-530-325                    |");
                System.out.println("                Student Registration Slip for Information Science                                      |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("College|Institute        | CCI                                    | Issue Datea: " + day + "       ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Program Name:            | " + (studentType == "1" ? "Regular" : "Distance") + " " + "|year: " + year + " |sem: " + semester);
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Department:              | Information Science                                                         |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                          STUDENT REGISTRATION SLIP                                                    |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("ID: " + id + "                                                         " + "| UID: " + uid + "                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Name: " + firstName + " " + lastName + "                                                " + "| Sex: " + sex + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Phone number: +251" + phone + "                                                " + "| Email: " + email + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("# | Courses Title For Information science            |  Course code |   Cr.Hr  |  ECTS | Instractor    |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("1.| Discrete maths                                   |   MTSc1012   |    5     |   5   | Dr.P          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("2.| Computer System                                  |   COEng2032  |    2     |   5   | Dr.Q          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("3.| Object-Oriented Programming                      |   SEng2081   |    3     |   4   | Dr.R          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("4.| Database Systems                                 |   SEng2021   |    4     |   5   | Dr.S          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("5.| Computer Networks                                |   SEng2019   |    4     |   4   | Dr.T          |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                                              Total: |                            23                   |");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
            } else if (getDepartment(department) == 5) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                 HARAMAYA UNIVERSITY                                                   |");
                System.out.println("              P.O.BOX: 138,Dire Dawa, Ethiopia. Website: www.haramaya.edu.et                           |");
                System.out.println("       Email: register@haramaya.edu.et, Tel: +251-255-530-313 Fax: +251-255-530-325                    |");
                System.out.println("                Student Registration Slip for Information System                                       |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("College|Institute        | CCI                                    | Issue Datea: " + day + "       ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Program Name:            | " + (studentType == "1" ? "Regular" : "Distance") + " " + "|year: " + year + " |sem: " + semester);
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Department:              | Information System                                                          |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                          STUDENT REGISTRATION SLIP                                                    |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("ID: " + id + "                                                         " + "| UID: " + uid + "                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Name: " + firstName + " " + lastName + "                                                " + "| Sex: " + sex + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Phone number: +251" + phone + "                                                " + "| Email: " + email + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("# | Courses Title For Information System             |  Course code |   Cr.Hr  |  ECTS | Instractor    |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("1.| Basic of Information system                      |   BISc1016   |    3     |   6   | Dr.U          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("2.| Introdacion to Statistics                        |   ISng2022   |    3     |   5   | Dr.V          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("3.| Object-Oriented Programming                      |   SEng2081   |    3     |   6   | Dr.W          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("4.| Database Systems                                 |   SEng2021   |    4     |   5   | Dr.X          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("5.| Programming Fundamentals                         |   PEng2019   |    4     |   5   | Dr.Y          |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                                              Total: |                            27                   |");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
            } else if (getDepartment(department) == 6) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>|");
                System.out.println("                                 HARAMAYA UNIVERSITY                                                   |");
                System.out.println("              P.O.BOX: 138,Dire Dawa, Ethiopia. Website: www.haramaya.edu.et                           |");
                System.out.println("       Email: register@haramaya.edu.et, Tel: +251-255-530-313 Fax: +251-255-530-325                    |");
                System.out.println("                Student Registration Slip for Statistics                                               |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("College|Institute        | CCI                                    | Issue Datea: " + day + "       ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Program Name:            | " + (studentType == "1" ? "Regular" : "Distance") + " " + "|year: " + year + " |sem: " + semester);
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Department:              | Statistics                                                                  |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                          STUDENT REGISTRATION SLIP                                                    |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("ID: " + id + "                                                         " + "| UID: " + uid + "                        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Name: " + firstName + " " + lastName + "                                                " + "| Sex: " + sex + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("Phone number: +251" + phone + "                                                " + "| Email: " + email + "        ");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("# | Courses Title For Statistics                     |  Course code |   Cr.Hr  |  ECTS | Instractor    |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("1.| Basic Statistics                                 |   BSSc1012   |    2     |   6   | Dr.z          |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("2.| Data Structures and Algorithms                   |   SEng2032   |    5     |   6   | Dr.Gar        |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("3.| Object-Oriented Programming                      |   SEng2081   |    4     |   6   | Dr.sab        |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("4.| Statistics with Python                           |   SEng2021   |    3     |   6   | Dr.char       |");
                System.out.println("--|--------------------------------------------------|--------------|----------|-------|---------------|");
                System.out.println("5.| Introduction to Statistics                       |   IEng2019   |    3     |   6   | Dr.Ran        |");
                System.out.println("-------------------------------------------------------------------------------------------------------|");
                System.out.println("                                              Total: |                            35                   |");
                System.out.println("--------------------------------------------------------------------------------------------------------\n");
            }
            Main n=new Main();

        }else if(Info==1) {
            Main n = new Main();

        }else if(Info==3){
            System.exit(99);

        }else if(!(Info==1||Info==0)){
            System.out.println("Choice Error: please Try Again");
            Info=input.nextInt();

        } else{System.exit(13);
        }
        getDepartment(department);

        switch (getDepartment(department)) {
            case 1:
                return "Software Engineering";
            case 2:
                return "Computer Science";
            case 3:
                return "Information Technology";
            case 4:
                return "Information Science";
            case 5:
                return "information system";
            case 6:
                return "Statics";
            default:
                return "Invalid Department";
        }

    }
}