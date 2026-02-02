package lab1;

import java.util.ArrayList;

import practice2.Student;

class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public GradeBook(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("invalid grade. must be 0-100.");
        }
    }

    public void setGrade(int studentIndex, int grade) {
        if (studentIndex >= 0 && studentIndex < students.size() && grade >= 0 && grade <= 100) {
            if (studentIndex < grades.size()) {
                grades.set(studentIndex, grade);
            } else {
                grades.add(grade);
            }
        }
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void displayMessage() {
        System.out.println("welcome to the grade book for " + course.getName() + " " +
                course.getDescription() + "!");
        System.out.println();
    }

    public void displayGradeReport() {
        if (grades.isEmpty()) {
            System.out.println("no grades to display.");
            return;
        }

        double average = determineClassAverage();
        int lowest = findLowestGrade();
        int highest = findHighestGrade();
        int lowestIndex = grades.indexOf(lowest);
        int highestIndex = grades.indexOf(highest);

        System.out.println("\nclass avg is " + String.format("%.2f", average) + ".");
        System.out.println("lowest grade is " + lowest + " (" + students.get(lowestIndex).getName() +
                ", id: " + students.get(lowestIndex).getId() + ").");
        System.out.println("highest grade is " + highest + " (" + students.get(highestIndex).getName() +
                ", id: " + students.get(highestIndex).getId() + ").");

        System.out.println("\ngrades distribution:");
        outputBarChart();
    }

    private double determineClassAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    private int findLowestGrade() {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    private int findHighestGrade() {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private void outputBarChart() {
        int[] frequency = new int[11]; // 0-9, 10-19, ..., 90-99, 100

        // count frequencies
        for (int grade : grades) {
            if (grade == 100) {
                frequency[10]++;
            } else {
                frequency[grade / 10]++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            // print *
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "gradebook for: " + course.toString() +
                "\nnumber of students: " + students.size();
    }
}
