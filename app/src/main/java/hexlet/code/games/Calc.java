package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calcGame() {
        var questionMessage = "What is the result of the expression?";
        String[] questions = new String[Engine.NUMBER_OF_ROUNDS];
        String[] answers = new String[Engine.NUMBER_OF_ROUNDS];

        for (var n = 0; n < Engine.NUMBER_OF_ROUNDS; n++) {
            var firstNumber = (int) (Math.random() * 20);
            var secondNumber = (int) (Math.random() * 20);
            Random signChoice = new Random();
            var sign = "+-*".charAt(signChoice.nextInt(3));
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
