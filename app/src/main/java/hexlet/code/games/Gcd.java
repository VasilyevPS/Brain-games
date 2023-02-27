package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    static final int MAX_NUMBER = 100;
    public static void gcdGame() {
        var questionMessage = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        for (var n = 0; n < Engine.NUMBER_OF_ROUNDS; n++) {
            var firstNumber = (int) (Math.random() * MAX_NUMBER);
            var secondNumber = (int) (Math.random() * MAX_NUMBER);
            questions[n] = firstNumber + " " + secondNumber;
            answers[n] = gcd(firstNumber, secondNumber) + "";
        }
        Engine.gameProcess(questionMessage, questions, answers);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return Math.abs(b);
        } else {
            return gcd(b, a % b);
        }
    }
}
