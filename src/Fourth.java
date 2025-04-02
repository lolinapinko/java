import java.util.Random;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        int row;
        int col;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        row = scanner.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        col = scanner.nextInt();

        int[][] array = new int[row][col];

        Random random = new Random();
        System.out.println("Массив заполнен следующими значениями: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                array[i][j] = random.nextInt(101) - 50; // случайное число от 0 до 99
                System.out.printf("%4d", array[i][j]); // %4d:  что число (%d) будет занимать минимум 4 символа
            }
            System.out.println();
        }

        int[] vectorB = new int[col];

        // Вычисляем сумму положительных элементов для каждого столбца
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
            vectorB[j] = sum;
        }

        // Выводим вектор B
        System.out.println("\nВектор B (суммы положительных элементов в столбцах):");
        for (int value : vectorB) {
            System.out.print(value + " ");
        }
    }
}
