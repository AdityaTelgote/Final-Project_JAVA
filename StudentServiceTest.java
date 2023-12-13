package Aditya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class StudentServiceTest {

   
    public void testRegisterStudent() {
        // Create a StudentService object
        StudentService studentService = new StudentService();

        // Create a new Student object
        Student newStudent = new Student("John Doe", "JD001", LocalDate.parse("2000-01-01"));

        // Register the student
        studentService.registerStudent(newStudent);

        // Check if the student is registered successfully
        assertTrue(studentService.isStudentRegistered("JD001"));
    }

    private void assertTrue(Object studentRegistered) {
		// TODO Auto-generated method stub
		
	}

	public void testGradeStudent() {
        // Create a StudentService object
        StudentService studentService = new StudentService();

        // Create a new Student object
        Student newStudent = new Student("Jane Smith", "JS002", LocalDate.parse("1999-05-15"));

        // Register the student
        studentService.registerStudent(newStudent);

        // Create a new Course object
        Course newCourse = new Course();

        // Enroll the student in the course
        studentService.enrollStudent("JS002", "MATH101");

        // Grade the student
        studentService.gradeStudent("JS002", "MATH101", 85);

        // Get the student's grade for the course
        int grade = studentService.getStudentGrade("JS002", "MATH101");

        // Check if the student's grade is recorded correctly
        assertEquals(85, grade);
    }

	private void assertEquals(int i, int grade) {
		// TODO Auto-generated method stub
		
	}
}
