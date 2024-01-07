package lab4;

public class Task3 {
    public static void main(String[] args) {
        int width = 6; // ширина прямоугольника
        int height = 4; // высота прямоугольника

        int[][] rectangle = new int[height][width]; // создаем двумерный массив

        // Заполняем массив цифрой 2
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                rectangle[i][j] = 2;
            }
        }

        // Выводим прямоугольник в консоль
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }
}
