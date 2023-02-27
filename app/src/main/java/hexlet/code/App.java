package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String gameOption = scanner.next();

        switch (gameOption) {
            case "1" -> Cli.greeting();
            case "2" -> Even.evenGame();
            case "3" -> Calc.calcGame();
            case "4" -> Gcd.gcdGame();
            case "5" -> Progression.progressionGame();
            default -> {
            }
        }

        scanner.close();
    }
}
