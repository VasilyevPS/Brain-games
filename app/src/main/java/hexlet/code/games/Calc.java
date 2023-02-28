package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static final int MAX_NUMBER = 20;
    public static void calcGame() {
        var questionMessage = "What is the result of the expression?";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            generateCalcData(round);
        }

        Engine.gameProcess(questionMessage, roundData);
    }

    public static void generateCalcData(String[] round) {
        var firstNumber = (int) (Math.random() * MAX_NUMBER);
        var secondNumber = (int) (Math.random() * MAX_NUMBER);
        var signOption = "+-*";
        var sign = signOption.charAt((int) (Math.random() * signOption.length()));
        round[0] = firstNumber + " " + sign + " " + secondNumber;
        round[1] = calculateAnswer(firstNumber, secondNumber, sign);
    }

    public static String calculateAnswer(int firstNumber, int secondNumber, char sign) {
        if (sign == '+') {
            return firstNumber + secondNumber + "";
        } else if (sign == '-') {
            return firstNumber - secondNumber + "";
        } else {
            return firstNumber * secondNumber + "";
        }
    }
}
