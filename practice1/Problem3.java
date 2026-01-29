import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("grade = ");
        Integer grade = scanner.nextInt();
        scanner.close();

        String letterGrade;
        if (grade >= 50) {
            String[] grades = { "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A" };
            int index = Math.min((grade - 50) / 5, 9);
            letterGrade = grades[index];
        } else letterGrade = "F";

        System.out.println(letterGrade);
    }
}