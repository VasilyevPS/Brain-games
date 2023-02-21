package hexlet.code;

import java.util.Scanner;
import java.util.Random;

class Calc {
    static void calcGame() {
        var userName = Cli.greeting();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);

        var count = 0;
        while (count < 3) {
            var firstNumber = (int) (Math.random() * 20);
            var secondNumber = (int) (Math.random() * 20);
            Random signChoice = new Random();
            var sign = "+-*".charAt(signChoice.nextInt(3));
            String question = firstNumber + " " + sign + " " + secondNumber;
            String expectedAnswer;
            if (sign == '+') {
                expectedAnswer = firstNumber + secondNumber + "";
            } else if (sign == '-') {
                expectedAnswer = firstNumber - secondNumber + "";
            } else {
                expectedAnswer = firstNumber * secondNumber + "";
            }
            System.out.println("Question: " + question);
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
