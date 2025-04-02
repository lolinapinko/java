/* Написать программу, получающую на вход в качестве аргумента два параметра - числа а и b.
Если произведение двух чисел больше 30,
 то вычислить удвоенный котангенс первого числа,
 в противном случае первое число разделить на 2.
 Вывести результат на экран. */
import java.util.Scanner;
import java.lang.Math;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a * b > 30){
            System.out.println(a + " * " + b + " > 30");
            double result = 2 * (1 / Math.tan(a));
            result = Math.round(result * 1000.0) / 1000.0;
            System.out.println("Первое число = " + result + " (округлено до 3х знаков после запятой)");
            System.out.println(result + " * " + b + " = " + result * b);
        } else
            System.out.println(a + " * " + b + " = " + a * b);
    }
}