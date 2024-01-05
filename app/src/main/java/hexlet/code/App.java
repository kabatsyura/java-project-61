package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice:");
        String typeOfGame = game.next();
        int countOfGames = 3;
        String userName = Cli.greeting(game);

        if (typeOfGame.equals("1")) {
            game.close();
        } else if (typeOfGame.equals("2")) {

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
}
