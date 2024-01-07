package lab4;

public class Task4 {
    public static void main(String[] args) {
        int size = 5; // размер треугольника

        int[][] triangle = new int[size][size]; // создаем двумерный массив

        // Заполняем массив цифрой 1 для элементов, находящихся над диагональю
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 1;
            }
        }

        // Выводим треугольник в консоль
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (triangle[i][j] == 1) {
                    System.out.print(triangle[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
