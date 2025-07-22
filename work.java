import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя пользователя: ");
        String name = scanner.nextLine();

        System.out.print("Привет, " + name);

        scanner.close();
    }
}