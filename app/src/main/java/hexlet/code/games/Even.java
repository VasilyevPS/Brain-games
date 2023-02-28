package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int MAX_NUMBER = 100;
    public static void evenGame() {
        var questionMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            int number = (int) (Math.random() * MAX_NUMBER);
            round[0] = number + "";
            if (number % 2 == 0) {
                round[1] = "yes";
            } else {
                round[1] = "no";
            }
        }
        Engine.gameProcess(questionMessage, roundData);
    }
}
