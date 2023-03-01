package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int MAX_NUMBER = 100;
    public static void startGame() {
        var questionMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            generateRound(round);
        }

        Engine.gameProcess(questionMessage, roundData);
    }
    public static void generateRound(String[] round) {
        int number = (int) (Math.random() * MAX_NUMBER);
        round[0] = number + "";
        round[1] = isEven(number);
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
