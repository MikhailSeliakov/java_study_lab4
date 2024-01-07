package lab4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Обратное преобразование: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    private static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = encryptCharacter(ch, key);
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static char encryptCharacter(char ch, int key) {
        char base = Character.isUpperCase(ch) ? 'A' : 'a';
        int offset = ch - base;
        int shiftedOffset = (offset + key) % 26;
        return (char) (base + shiftedOffset);
    }

    private static String decrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char decryptedChar = decryptCharacter(ch, key);
                result.append(decryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static char decryptCharacter(char ch, int key) {
        char base = Character.isUpperCase(ch) ? 'A' : 'a';
        int offset = ch - base;
        int shiftedOffset = (offset - key + 26) % 26;
        return (char) (base + shiftedOffset);
    }
}
