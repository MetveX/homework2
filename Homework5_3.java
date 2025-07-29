import java.util.Scanner;
import java.util.Arrays;

public class Homework5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два слова разделенных одним пробелом: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i].toLowerCase();

            char[] letters = word.toCharArray();

            Arrays.sort(letters);

            words[i] = new String(letters);
        }

        String result = words[0] + " " + words[1];
        System.out.println("Результат: " + result);
    }
}