package hexlet.code;

import java.util.Scanner;

class Even {
    static void evenGame() {
        var userName = Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        var count = 0;
        while (count < 3) {
            int number = (int) (Math.random() * 100);
            String expectedAnswer;
            if (number % 2 == 0) {
                expectedAnswer = "yes";
            } else {
                expectedAnswer = "no";
            }
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(expectedAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + expectedAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
