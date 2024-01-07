package lab4;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int rows = 3; // количество строк
        int cols = 5; // количество столбцов

        int[][] matrix = new int[rows][cols]; // создаем двумерный массив

        Random random = new Random();

        // заполняем массив случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        printMatrix(matrix);

        // создаем новый массив с переставленными строками и столбцами
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Массив с переставленными строками и столбцами:");
        printMatrix(transposedMatrix);
    }

    // метод для печати двумерного массива
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
