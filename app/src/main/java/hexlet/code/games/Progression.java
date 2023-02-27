package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static final int MAX_FIRST_NUMBER = 20;
    static final int PROGRESSION_LENGTH = (int) (Math.random() * 10) + 5;
    static final int MAX_DIFFERENCE = 5;
    public static void progressionGame() {
        var questionMessage = "What number is missing in the progression?";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        for (var n = 0; n < Engine.NUMBER_OF_ROUNDS; n++) {
            var firstNumber = (int) (Math.random() * MAX_FIRST_NUMBER);
            var difference = (int) (Math.random() * MAX_DIFFERENCE) + 1;
            var hiddenNumberPlace = (int) (Math.random() * PROGRESSION_LENGTH);
            questions[n] = "";
            for (var i = 0; i < PROGRESSION_LENGTH; i++) {
                if (i != hiddenNumberPlace) {
                    questions[n] = questions[n] + (firstNumber + difference * i) + " ";
                } else {
                    questions[n] = questions[n] + ".." + " ";
                    answers[n] = firstNumber + difference * i + "";
                }
            }
        }
        Engine.gameProcess(questionMessage, questions, answers);
    }
}
