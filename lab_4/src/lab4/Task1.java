package lab4;

public class Task1 {
    public static void main(String[] args) {
        int width = 23; // ширина прямоугольника в колонках
        int height = 11; // высота прямоугольника в строках

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
