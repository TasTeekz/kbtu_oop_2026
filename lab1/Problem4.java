package lab1;

import java.util.ArrayList;
import java.util.Scanner;

import practice2.Student;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course course = new Course("CS101", "Object-oriented Programming and Design", 4);
        course.addPrerequisite("CS100");

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.addStudent(new Student("student A", 2));
        gradeBook.addStudent(new Student("student B", 2));
        gradeBook.addStudent(new Student("student C", 3));
        gradeBook.addStudent(new Student("student D", 2));
        gradeBook.addStudent(new Student("student E", 1));
        gradeBook.addStudent(new Student("student F", 2));
        gradeBook.addStudent(new Student("student G", 3));
        gradeBook.addStudent(new Student("student H", 2));
        gradeBook.addStudent(new Student("student I", 2));
        gradeBook.addStudent(new Student("student J", 1));

        gradeBook.displayMessage();

        System.out.println("input grades for students:");
        ArrayList<Student> students = gradeBook.getStudents();

        for (int i = 0; i < students.size(); i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print(students.get(i).getName() + ": ");
                try {
                    String input = scanner.nextLine().trim();
                    int grade = Integer.parseInt(input);

                    if (grade >= 0 && grade <= 100) {
                        gradeBook.addGrade(grade);
                        validInput = true;
                    } else {
                        System.out.println("grade must be 0-100. try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("invalid input. enter a number 0-100.");
                }
            }
        }

        gradeBook.displayGradeReport();

        scanner.close();
    }
}
