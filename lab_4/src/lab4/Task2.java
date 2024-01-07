package lab4;

public class Task2 {
    public static void main(String[] args) {
        int height = 10; // высота треугольника

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
