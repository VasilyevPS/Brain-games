package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static final int MAX_NUMBER = 20;
    public static void calcGame() {
        var questionMessage = "What is the result of the expression?";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        for (var n = 0; n < Engine.NUMBER_OF_ROUNDS; n++) {
            var firstNumber = (int) (Math.random() * MAX_NUMBER);
            var secondNumber = (int) (Math.random() * MAX_NUMBER);
            var signOption = "+-*";
            var sign = signOption.charAt((int) (Math.random() * signOption.length()));
            questions[n] = firstNumber + " " + sign + " " + secondNumber;
            if (sign == '+') {
                answers[n] = firstNumber + secondNumber + "";
            } else if (sign == '-') {
                answers[n] = firstNumber - secondNumber + "";
            } else {
                answers[n] = firstNumber * secondNumber + "";
            }
        }
        Engine.gameProcess(questionMessage, questions, answers);
    }
}
