package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int MAX_NUMBER = 100;
    public static void primeGame() {
        var questionMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        for (var n = 0; n < Engine.NUMBER_OF_ROUNDS; n++) {
            int number = (int) (Math.random() * MAX_NUMBER);
            questions[n] = number + "";
            answers[n] = isPrime(number);
        }
        Engine.gameProcess(questionMessage, questions, answers);
    }

    public static String isPrime(int number) {
        if (number == 0 || number == 1) {
            return "no";
        }
        for (var i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
