package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int MAX_NUMBER = 100;
    public static void evenGame() {
        var questionMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        for (var n = 0; n < Engine.NUMBER_OF_ROUNDS; n++) {
            int number = (int) (Math.random() * MAX_NUMBER);
            questions[n] = number + "";
            if (number % 2 == 0) {
                answers[n] = "yes";
            } else {
                answers[n] = "no";
            }
        }
        Engine.gameProcess(questionMessage, questions, answers);
    }
}
