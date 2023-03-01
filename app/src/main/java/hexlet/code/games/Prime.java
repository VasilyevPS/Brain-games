package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int MAX_NUMBER = 100;
    public static void startGame() {
        var questionMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            generateRound(round);
        }

        Engine.gameProcess(questionMessage, roundData);
    }

    public static void generateRound(String[] round) {
        int number = (int) (Math.random() * MAX_NUMBER);
        round[0] = number + "";
        round[1] = isPrime(number);
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
