import java.util.Scanner;

public class Homework5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность: ");
        String sequence = scanner.nextLine();

        int count = 0;

        for (int i = 0; i <= sequence.length() - 5; i++) {

            String part = sequence.substring(i, i + 5);


            if (part.equals(">>-->") || part.equals("<--<<")) {
                count++;
            }
        }

        System.out.println("Количество стрелок: " + count);
    }
}