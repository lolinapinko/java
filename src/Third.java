import java.util.Random;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        length = scanner.nextInt();

        int[] array = new int[length];

        Random random = new Random();
        System.out.print("Массив заполнен следующими значениями: ");
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // случайное число от 0 до 99
            System.out.print(array[i] + " ");
        }

        int counter = 0;

        for (int i = 1; i < length; i++){
            if (array[i] > array[i - 1])
                counter++;
        }

        System.out.println("\nЭлементов, которые больше предыдущего числа: " + counter);



    }
}
