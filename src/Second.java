import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int minA3B = Math.min(a, 3 * b);
        int maxA3B = Math.max(a, 3 * b);
        int minAB = Math.min(a, b);

        double d = minA3B - 2 * Math.sqrt(maxA3B);
        d /= Math.pow(4, 3) +  (double) maxA3B / minAB;

        System.out.println(d);
    }
}
