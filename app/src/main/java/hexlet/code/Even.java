package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void isEven(Scanner game, int countOfGames, String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < countOfGames; i++) {
            int number = (int) Math.floor(Math.random() * 20);
            System.out.print("Question: " + number + "\nYour answer: ");
            String answerOfClient = game.next();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            if (answerOfClient.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerOfClient + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        game.close();
    }
}
