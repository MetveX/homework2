import java.util.Scanner;

public class Homework5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите маленькую букву английского алфавита: ");
        String input = scanner.nextLine();
        char letter = input.charAt(0);

        String keyboard = "qwertyuiopasdfghjklzxcvbnm";

        int position = keyboard.indexOf(letter);

        int leftPosition;
        if (position == 0) {
            leftPosition = keyboard.length() - 1;
        } else {
            leftPosition = position - 1;
        }

        char leftLetter = keyboard.charAt(leftPosition);
        System.out.println("Буква слева: " + leftLetter);
    }
}