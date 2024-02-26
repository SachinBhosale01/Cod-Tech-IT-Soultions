package Student.Grade.Management.System;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<Student> studentList = new ArrayList<>();
	
		while(true) {
			System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                addStudent(scanner, studentList);
                break;
            case 2:
                updateStudent(scanner, studentList);
                break;
            case 3:
                deleteStudent(scanner, studentList);
                break;
            case 4:
                viewAllStudents(studentList);
                break;
            case 5:
                System.out.println("Exiting Grade Management System. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }  
		}
	}
	
	private static void addStudent(Scanner scanner, ArrayList<Student> studentList) {
		 	System.out.println("Enter student details:");
	        System.out.print("Name: ");
	        String name = scanner.next();
	        System.out.print("Roll Number: ");
	        int rollNumber = scanner.nextInt();
	        System.out.print("Number of subjects: ");
	        int numSubjects = scanner.nextInt();
	        
	        int[] marks = new int[numSubjects];
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }
	        
	        Student newStudent = new Student(name, rollNumber, marks);
	        studentList.add(newStudent);
	        System.out.println("Student added successfully!");
	}
	
	 private static void updateStudent(Scanner scanner, ArrayList<Student> studentList) {
		 System.out.print("Enter the Roll Number of the student to update: ");
	     int rollNumber = scanner.nextInt();
	     
	     for(Student student : studentList) {
	    	 if(student.rollNumber == rollNumber) {
	    		 System.out.println("Enter new marks for the student:");
	                for (int i = 0; i < student.marks.length; i++) {
	                    System.out.print("Enter marks for Subject " + (i + 1) + ": ");
	                    student.marks[i] = scanner.nextInt();
	                }
	                student.calculatePercentageAndGrade();
	                System.out.println("Student updated successfully!");
	                return;
	    	 }
	     }
	     System.out.println("Student with Roll Number " + rollNumber + " not found.");
	 }
	 
	 private static void deleteStudent(Scanner scanner, ArrayList<Student> studentList) {
	        System.out.print("Enter the Roll Number of the student to delete: ");
	        int rollNumber = scanner.nextInt();

	        for (Student student : studentList) {
	            if (student.rollNumber == rollNumber) {
	                studentList.remove(student);
	                System.out.println("Student deleted successfully!");
	                return;
	            }
	        }

	        System.out.println("Student with Roll Number " + rollNumber + " not found.");
	    }
	
	
	private static void viewAllStudents(ArrayList<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("List of all students:");
            for (Student student : studentList) {
                System.out.println("Name: " + student.studentName);
                System.out.println("Roll Number: " + student.rollNumber);
                System.out.println("Percentage: " + student.percentage);
                System.out.println("Grade: " + student.grade);
                System.out.println("---------------");
            }
        }
	}

}
