package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static final int MAX_FIRST_NUMBER = 20;
    static final int PROGRESSION_LENGTH = (int) (Math.random() * 10) + 5;
    static final int MAX_DIFFERENCE = 5;
    public static void startGame() {
        var questionMessage = "What number is missing in the progression?";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            generateRound(round);
        }

        Engine.gameProcess(questionMessage, roundData);
    }

    public static void generateRound(String[] round) {
        var firstNumber = (int) (Math.random() * MAX_FIRST_NUMBER);
        var difference = (int) (Math.random() * MAX_DIFFERENCE) + 1;
        var hiddenNumberPlace = (int) (Math.random() * PROGRESSION_LENGTH);
        round[0] = generateProgression(firstNumber, difference, hiddenNumberPlace);
        round[1] = firstNumber + difference * hiddenNumberPlace + "";
    }

    public static String generateProgression(int firstNumber, int difference, int hiddenNumberPlace) {
        StringBuilder progression = new StringBuilder();
        for (var i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i != hiddenNumberPlace) {
                progression.append(firstNumber + difference * i).append(" ");
            } else {
                progression.append("..").append(" ");
            }
        }
        return progression.toString();
    }
}
