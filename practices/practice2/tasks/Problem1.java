package practices.practice2.tasks;

import practices.practice2.models.Student;

public class Problem1 {
    public static void main(String[] args) {
        Student student = new Student("Alisher", 1);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Year: " + student.getYear());
        System.out.println("Year incremented: " + student.incrementYear());

        Student student2 = new Student("Name", 1);
        System.out.println(student2);
    }

}
