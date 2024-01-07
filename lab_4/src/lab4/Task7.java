package lab4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int rows = 4; // количество строк
        int cols = 5; // количество столбцов

        int[][] matrix = new int[rows][cols]; // создаем двумерный массив

        int value = 1; // значение для заполнения массива

        for (int i = 0; i < rows; i++) {
            // заполняем строки слева направо или справа налево
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = value;
                    value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    matrix[i][j] = value;
                    value++;
                }
            }
        }

        System.out.println("Заполненный массив:");
        printMatrix(matrix);
    }

    // метод для печати двумерного массива
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
