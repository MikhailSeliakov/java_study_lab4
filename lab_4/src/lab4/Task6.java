package lab4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int rows = 4; // количество строк
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

        // генерируем случайные индексы строки и столбца для удаления
        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);

        System.out.println("Удаляем строку с индексом " + rowToRemove);
        System.out.println("Удаляем столбец с индексом " + colToRemove);

        // создаем новый массив с удаленной строкой и столбцом
        int[][] newArray = new int[rows - 1][cols - 1];
        int newRow = 0;
        int newCol;

        for (int i = 0; i < rows; i++) {
            if (i == rowToRemove) {
                continue; // пропускаем удаленную строку
            }

            newCol = 0;

            for (int j = 0; j < cols; j++) {
                if (j == colToRemove) {
                    continue; // пропускаем удаленный столбец
                }

                newArray[newRow][newCol] = matrix[i][j];
                newCol++;
            }

            newRow++;
        }

        System.out.println("Массив с удаленной строкой и столбцом:");
        printMatrix(newArray);
    }

    // метод для печати двумерного массива
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
