import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        Integer side = scanner.nextInt();
        scanner.close();

        Integer area = side * side;
        Integer perimeter = 4 * side;
        Float diagonal = (float) Math.sqrt(2) * side;
        System.out.println("S = " + area);
        System.out.println("P = " + perimeter);
        System.out.println("d = " + diagonal);
    }
}