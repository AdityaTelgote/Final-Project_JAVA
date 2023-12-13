package Aditya;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import com.generation.*;

public class Registration {
    public static void main(String[] args) {
        // Initialize StudentService and Scanner
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);

        // Create a new student (example with createStudentMenu)
        createStudentMenu(studentService, scanner);

        // Close the Scanner
        scanner.close();
    }

    public static void createStudentMenu(StudentService studentService, Scanner scanner) {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.println("Enter date of birth (YYYY-MM-DD): ");
        String dobString = scanner.nextLine();

        try {
            // Attempt to parse the date of birth string into LocalDate
            LocalDate dob = LocalDate.parse(dobString);

            // Create the student if date format is correct
            Student newStudent = new Student(name);
            studentService.registerStudent(newStudent);

            System.out.println("Student created successfully!");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
        }
    }
}
