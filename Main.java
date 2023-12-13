/*Question
 * Implementing the missing main method features
Implement the method to gradeStudent( StudentService studentService, Scanner scanner ) in src/com/generation/Main.java  to have a fully functional program.

Test the program to verify it works as expected:

Create a new student.
Enrroll the student to few courses.
Grade the student.
Show the students and courses summary and verify that data is correct.
 */

package Aditya;

import java.util.Scanner;

import com.generation.model.Student;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StudentService
        StudentService studentService = new StudentService();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Call gradeStudent method
        gradeStudent(studentService, scanner);

        // Close the scanner
        scanner.close();
    }

    public static void gradeStudent(StudentService studentService, Scanner scanner) {
        // Create a new student
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        // Enroll the student in a few courses
        System.out.println("Enter number of courses to enroll:");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course name " + (i + 1) + ":");
            String courseName = scanner.nextLine();
            studentService.enrollStudent(student, courseName);
        }

        // Grade the student
        System.out.println("Enter grade for the student:");
        double grade = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        student.setGrade(grade);

        // Show the students and courses summary
        System.out.println("Student Summary:");
        System.out.println("Name: " + student.getName());
        System.out.println("Courses Enrolled:");
        for (String course : student.getCourses()) {
            System.out.println("- " + course);
        }
        System.out.println("Grade: " + student.getName());
    }
}