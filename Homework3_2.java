import java.util.Random;

public class Homework3_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int vasyaChoice = random.nextInt(3);
        int petyaChoice = random.nextInt(3);

        String[] choices = {"камень", "ножницы", "бумага"};

        System.out.println("Вася показал: " + choices[vasyaChoice]);
        System.out.println("Петя показал: " + choices[petyaChoice]);

        if (vasyaChoice == petyaChoice) {
            System.out.println("Ничья");
        } else if ((vasyaChoice == 0 && petyaChoice == 1) ||
                (vasyaChoice == 1 && petyaChoice == 2) ||
                (vasyaChoice == 2 && petyaChoice == 0)) {
            System.out.println("Выиграл Вася");
        } else {
            System.out.println("Выиграл Петя");
        }
    }
}