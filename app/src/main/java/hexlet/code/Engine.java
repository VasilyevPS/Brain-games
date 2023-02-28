package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void gameProcess(String questionMessage, String[][] data) {
        String userName = Cli.greeting();
        System.out.println(questionMessage);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < NUMBER_OF_ROUNDS) {
            System.out.println("Question: " + data[count][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(data[count][1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[count][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == NUMBER_OF_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
