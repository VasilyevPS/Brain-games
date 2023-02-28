package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static final int MAX_NUMBER = 20;
    public static void calcGame() {
        var questionMessage = "What is the result of the expression?";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            var firstNumber = (int) (Math.random() * MAX_NUMBER);
            var secondNumber = (int) (Math.random() * MAX_NUMBER);
            var signOption = "+-*";
            var sign = signOption.charAt((int) (Math.random() * signOption.length()));
            round[0] = firstNumber + " " + sign + " " + secondNumber;
            if (sign == '+') {
                round[1] = firstNumber + secondNumber + "";
            } else if (sign == '-') {
                round[1] = firstNumber - secondNumber + "";
            } else {
                round[1] = firstNumber * secondNumber + "";
            }
        }
        Engine.gameProcess(questionMessage, roundData);
    }
}
