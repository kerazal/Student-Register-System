package ASS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private Object Dep;


    public static void main(String[] args) {
try {
    Scanner input = new Scanner(System.in);
    System.out.println("\n                        1.ENTER 1 TO CONTINUE REGISTER:");
    System.out.println("\n                        2.ENTER OTHER NUMBER TO EXIT:");
    int register = input.nextInt();

    if (register == 1) {
        var D1 = new Dep();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[                                                            ]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[ WELCOME TO HARAMAYA UNIVERSITY STUDENT REGISTRATION SYSTEM ]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>[                                                            ]>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // Printing the welcome message and header for the student registration system.
        // This section provides a visual representation of the system to the user.
        // It creates a sense of anticipation and excitement for the registration process.
        // The use of multiple '>' characters creates a visual effect of a large header.
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        try {
            System.out.print("\n               Enter Admin password: eg.[1234] : ");
            String password = input.next();

            String regoxx = "^[1,2,3,4 ]{4}";

            if (password.matches(regoxx)) {
                System.out.print("");
            } else if (!(password.matches(regoxx))) {
                while (true) {
                    System.err.println("Incorrect Password! please Enter correct password 4 digits");
                    password = input.next();
                    if (password.matches(regoxx))
                        break;
                }
                if (password.matches(regoxx)) {
                    System.out.println("Password is checked");
                } else {
                    System.err.println("Password ERROR OCCURRED");
                    System.exit(0);
                }
            }
        } catch (InputMismatchException a) {
            System.out.println("Input Error Occurred");
        }
        // Comment: Prompting the user to enter the admin password for authentication.
        // The password is checked against a regular expression to ensure it is 4 digits long.
        // If the password is invalid, the user is prompted to enter the correct password.
        // If the password is still invalid after multiple attempts, the program exits.

//                //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//

        System.out.print("               Enter register DD/MM/YY: ");
        String day = input.next();
        D1.setDay(day);

        String regoox = "^[0-9/ .-]+$";

        if (day.matches(regoox)) {
            System.out.print("");
        } else if (!(day.matches(regoox))) {
            while (true) {
                System.err.println("invalid day! please try Again");
                day = input.next();
                if (day.matches(regoox))
                    break;
            }
            if (day.matches(regoox)) {
                System.out.println("Day is checked");
            } else {
                System.err.println("Day ERROR OCCURRED");
                System.exit(1);
            }
        }

        // Comment: Prompting the user to enter the registration date in the format DD/MM/YY.
        // The date is checked against a regular expression to ensure it is in the correct format.
        // If the date is invalid, the user is prompted to enter the correct date.
        // If the date is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        int n = 50; //maximum number student we register
        for (int i = 0; i <= n; i++) {

            try {
                System.out.println("Choose your student type:");
                System.out.println("1. Regular Student");
                System.out.println("2. Distance Student");
                String studentType = input.next();
                D1.setStudentType(studentType);

                String regexg = "^[1-2]{1}";
                if (studentType.matches(regexg)) {
                    System.out.print("");
                } else if (!(studentType.matches(regexg))) {
                    while (true) {
                        System.err.println("invalid Chioce For Type Of Student! please Enter Correct Choice");
                        studentType = input.next();
                        if (studentType.matches(regexg))
                            break;
                    }
                    if (studentType.matches(regexg)) {
                        System.out.println("Student type is checked");
                    } else {
                        System.err.println("STUDENT TYPE ERROR OCCURRED");
                        System.exit(2);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("STUDENT TYPE ERROR OCCURRED");
            }
            // Comment: Prompting the user to choose the type of student (Regular or Distance).
            // The user's choice is stored in the 'studentType' variable.
            // If the choice is valid (1 or 2), the program continues.
            // If the choice is invalid, the user is prompted to enter a valid choice.
            // If the choice is still invalid after multiple attempts, the program exits.
////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            try {
                System.out.print("Enter year: ");
                String year = input.next();
                D1.setYear(year);

                String regexv = "^[1-5]{1}";
                if (year.matches(regexv)) {
                    System.out.print("");
                } else if (!(year.matches(regexv))) {
                    while (true) {
                        System.err.println("Incorrect Year: Enter year 1-5");
                        year = input.next();
                        if (year.matches(regexv))
                            break;
                    }
                    if (year.matches(regexv)) {
                        System.out.println("Year type is checked");
                    } else {
                        System.err.println("YEAR ERROR OCCERED");
                        System.exit(88);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("YEAR ERROR OCCURRED");
            }

            // Comment: Prompting the user to enter the year of study (1-5).
            // The year is checked to ensure it is within the valid range.
            // If the year is invalid, the user is prompted to enter the correct year.
            // If the year is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            try {
                System.out.print("Enter semester: ");
                String semester = input.next();
                D1.setSemester(semester);

                String regexa = "^[1-2]{1}";
                if (semester.matches(regexa)) {
                    System.out.print("");
                } else if (!(semester.matches(regexa))) {
                    while (true) {
                        System.err.println("invalid Choice for semester! please try Again");
                        semester = input.next();
                        if (semester.matches(regexa))
                            break;
                    }
                    if (semester.matches(regexa)) {
                        System.out.println("Semester type is checked");
                    } else {
                        System.err.println("SEMESTER ERROR OCCURRED");
                        System.exit(68);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("YEAR ERROR OCCURRED");
            }
            // Comment: Prompting the user to enter the semester (1 or 2).
            // The semester is checked to ensure it is a valid choice.
            // If the choice is invalid, the user is prompted to enter a valid choice.
            // If the choice is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            System.out.println("Choose your department:");
            System.out.println("1. Software Engineering");
            System.out.println("2. Computer Science");
            System.out.println("3. Information Technology");
            System.out.println("4. Information Science");
            System.out.println("5. information system");
            System.out.println("6. Statistics");
            int department = input.nextInt();

            try {
                if (department <= 6) {
                    System.out.print("");
                } else if (!(department <= 6)) {

                    System.err.println("Incorrect Choice For Department: Enter year 1-6");
                    department = input.nextInt();
                }

            } catch (InputMismatchException s) {
                System.out.println("Input Error Occurred");
            }
            // Comment: Prompting the user to choose their department.
            // The user's choice is stored in the 'department' variable.
            // If the choice is valid (1-6), the program continues.
            // If the choice is invalid, the user is prompted to enter a valid choice.
            // If the choice is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            D1.setDepartment((department));
            Course s = new Course();
            s.Student();
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            try {
                System.out.print("\nEnter your ID:");
                String id = input.next();
                D1.setId(id);

                String regox = "^[0-9 ]{4}";
                if (id.matches(regox)) {
                    System.out.print("");
                } else if (!(id.matches(regox))) {
                    while (true) {
                        System.err.println("invalid ID NO! please Enter correct ID ID 4 digits");
                        id = input.next();
                        if (id.matches(regox))
                            break;
                    }
                    if (id.matches(regox)) {
                        System.out.println("ID is checked");
                    } else {
                        System.err.println("ID ERROR OCCURRED");
                        System.exit(3);
                    }
                }
            } catch (InputMismatchException a) {
                System.out.println("Input Error Occurred");
            }
            // Comment: Prompting the user to enter their ID number.
            // The ID number is checked against a regular expression to ensure it is 4 digits long.
            // If the ID number is invalid, the user is prompted to enter the correct ID number.
            // If the ID number is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            try {
                System.out.print("Enter your UID: ");
                String uid = input.next();
                D1.setUid(uid);

                String regex = "^[0-9 ]{6}";
                if (uid.matches(regex)) {
                    System.out.print("");
                } else if (!(uid.matches(regex))) {
                    while (true) {
                        System.err.println("invalid UID NO! please Enter correct UID 6 digits");
                        uid = input.next();
                        if (uid.matches(regex))
                            break;
                    }
                    if (uid.matches(regex)) {
                        System.out.println("UID is checked");
                    } else {
                        System.err.println("ID ERROR OCCURRED");
                        System.exit(4);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("UID ERROR OCCURRED");
            }
            // Comment: Prompting the user to enter their UID (Unique Identification Number).
            // The UID is checked against a regular expression to ensure it is 6 digits long.
            // If the UID is invalid, the user is prompted to enter the correct UID.
            // If the UID is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            try {
                System.out.print("Enter your first name: ");
                String firstName = input.next();
                D1.setFirstName(firstName);

                String regx = "^[A-Za-z ]+$";
                if (firstName.matches(regx)) {
                    System.out.print("");
                } else if (!(firstName.matches(regx))) {
                    while (true) {
                        System.err.println("invalid name!! please Enter correct first name");
                        firstName = input.next();
                        if (firstName.matches(regx))
                            break;
                    }
                    if (firstName.matches(regx)) {
                        System.out.println("Fname is checked");
                    } else {
                        System.err.println("FNAME ERROR OCCURRED");
                        System.exit(4);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("INPUT FNAME ERROR OCCURRED");
            }

            // Comment: Prompting the user to enter their first name.
            // The first name is checked against a regular expression to ensure it contains only letters and spaces.
            // If the first name is invalid, the user is prompted to enter the correct first name.
            // If the first name is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            try {
                System.out.print("Enter your last name: ");
                String lastName = input.next();
                D1.setLastName(lastName);

                String reegx = "^[A-Za-z ]+$";
                if (lastName.matches(reegx)) {
                    System.out.print("");
                } else if (!(lastName.matches(reegx))) {
                    while (true) {
                        System.err.println("invalid name!! please Enter correct last name");
                        lastName = input.next();
                        if (lastName.matches(reegx))
                            break;
                    }
                    if (lastName.matches(reegx)) {
                        System.out.println("Lname is checked");
                    } else {
                        System.err.println("LNAME ERROR OCCURRED");
                        System.exit(6);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("INPUT LNAME ERROR OCCURRED");
            }
            // Comment: Prompting the user to enter their last name.
            // The last name is checked against a regular expression to ensure it contains only letters and spaces.
            // If the last name is invalid, the user is prompted to enter the correct last name.
            // If the last name is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            try {
                System.out.print("Enter your sex: ");
                String sex = String.valueOf(input.next().charAt(0));
                D1.setSex(sex);

                String regeex = "^[A-Za-z ]+$";
                if (sex.matches(regeex)) {
                    System.out.print("");
                } else if (!(sex.matches(regeex))) {
                    while (true) {
                        System.err.println("invalid info!! please Enter sex");
                        sex = input.next();
                        if (sex.matches(regeex))
                            break;
                    }
                    if (sex.matches(regeex)) {
                        System.out.println("Sex is checked");
                    } else {
                        System.err.println("SEX ERROR OCCURRED");
                        System.exit(7);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("INPUT SEX ERROR OCCURRED");
            }

            // Comment: Prompting the user to enter their sex (gender).
            // The sex is checked against a regular expression to ensure it contains only letters and spaces.
            // If the sex is invalid, the user is prompted to enter the correct sex.
            // If the sex is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            try {
                System.out.println("Enter student phone: [+2519........]");

                String phone = input.next();

                String regooox = "^[0-9 ]{10}";

                if (phone.matches(regooox)) {
                    System.out.print("");
                } else if (!(phone.matches(regooox))) {
                    while (true) {
                        System.err.println("invalid phone number! please Enter correct phone number 10 digits");
                        phone = input.next();
                        if (phone.matches(regooox))
                            break;
                    }
                    if (phone.matches(regooox)) {
                        System.out.println("phone number is checked");
                    } else {
                        System.err.println("PHONE NUMBER ERROR OCCURRED");
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException a) {
                System.out.println("Input Error Occurred");
            }


            // Comment: Prompting the user to enter their phone number.
            // The phone number is checked against a regular expression to ensure it is 10 digits long.
            // If the phone number is invalid, the user is prompted to enter the correct phone number.
            // If the phone number is still invalid after multiple attempts, the program exits.

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//                System.out.println("Enter student email: eg:[kerazal@71.gmail.com]");
//                String email = input.next();
//                D1.setEmail(email);
//                String regoyx = "^[A-Za-z,0-9 ,/,@,.]+$";
//
//                if (email.matches(regoyx)) {
//                    System.out.print("");
//                } else if ((!email.matches(regoyx))) {
//                    System.out.println("Invalid Email: we use Invalid character please Enter correct Email");
//                } else {
//                    System.err.println("EMAIL ERROR OCCERED");
//                    System.exit(8);
//                }

            try {
                System.out.println("Enter student email: eg:[kerazal@71.gmail.com]");
                String email = input.next();
                D1.setEmail(email);

                String regoyx = "^[A-Za-z,0-9 ,/,@,.]+$";
                if (email.matches(regoyx)) {
                    System.out.print("");
                } else if (!(email.matches(regoyx))) {
                    while (true) {
                        System.err.println("Invalid Email: we use Invalid character please Enter correct Email");
                        email = input.next();
                        if (email.matches(regoyx))
                            break;
                    }
                    if (email.matches(regoyx)) {
                        System.out.println("Email Checked");
                    } else {
                        System.err.println("EMAIL ERROR OCCERED");
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException a) {
                System.err.println("INPUT EMAIL ERROR OCCURRED");
            }


            D1.D();
            System.out.println("Advisor Name: Dr.x                                                 Registere:____yes____");
            System.out.println("Notice: This register slip should not be signed by adisors without cheking credit hours and prerequsite course\n");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n ");

        }
    } else if (register == 2) {
        System.exit(11);
        }
     }catch (InputMismatchException v) {
    System.err.println("INPUT ERROR OCCURRED PLEASE TRY AGAIN");
         }
    }
}
