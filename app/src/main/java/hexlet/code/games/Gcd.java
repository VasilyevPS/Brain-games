package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    static final int MAX_NUMBER = 100;
    public static void gcdGame() {
        var questionMessage = "Find the greatest common divisor of given numbers.";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (var round : roundData) {
            generateGcdData(round);
        }

        Engine.gameProcess(questionMessage, roundData);
    }

    public static void generateGcdData(String[] round) {
        var firstNumber = (int) (Math.random() * MAX_NUMBER);
        var secondNumber = (int) (Math.random() * MAX_NUMBER);
        round[0] = firstNumber + " " + secondNumber;
        round[1] = gcd(firstNumber, secondNumber) + "";
    }
    
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return Math.abs(b);
        } else {
            return gcd(b, a % b);
        }
    }
}
