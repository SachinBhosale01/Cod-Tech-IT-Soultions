package Student.Grade.Management.System;

public class Student {
	String studentName;
	int rollNumber;
	int[] marks;
	double percentage;
	char grade;
	public Student(String studenName, int rollnumber,int[] marks) {
		this.studentName = studenName;
		this.rollNumber = rollnumber;
		this.marks = marks;
		calculatePercentageAndGrade();
	}
	public void calculatePercentageAndGrade() {
		int totalMarks=0;
		for(int mark : marks) {
			totalMarks += mark;
		}
		percentage = (double) totalMarks/marks.length;
		if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
	}

}
