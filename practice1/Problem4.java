import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a = ");
        Integer a = scanner.nextInt();
        System.out.println("b = ");
        Integer b = scanner.nextInt();
        System.out.println("c = ");
        Integer c = scanner.nextInt();
        scanner.close();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant < 0) System.out.println("error. d < 0");
        else if (discriminant == 0) {
            double root = -b / (2.0 * a);
            System.out.println("x = " + root);
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double root1 = (-b + sqrtDiscriminant) / (2.0 * a);
            double root2 = (-b - sqrtDiscriminant) / (2.0 * a);
            System.out.println("x1 = " + root1 + "\nx2 = " + root2);
        }
    }
}