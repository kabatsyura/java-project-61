package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.QuestionAnswer;
import java.util.Scanner;

public class Engine {
    public static String chooseGame(String typeOfGame) {
        return switch (typeOfGame) {
            case "2" -> Even.getIntro();
            case "3" -> Calc.getIntro();
            case "4" -> GCD.getIntro();
            case "5" -> Progression.getIntro();
            case "6" -> Prime.getIntro();
            default -> "";
        };
    }

    public static void playGame(String userName, Scanner game, String typeOfGame, int countOfGames) {
        boolean isAnswerCorrect = true;
        int indexOfGames = 0;
        QuestionAnswer answer = null;

        while (isAnswerCorrect && indexOfGames < countOfGames) {
            switch (typeOfGame) {
                case "2":
                    answer = Even.getQuestionAnswer(20);
                    break;
                case "3":
                    answer = Calc.getQuestionAnswer(20);
                    break;
                case "4":
                    answer = GCD.getQuestionAnswer(100, 50);
                    break;
                case "5":
                    answer = Progression.getQuestionAnswer(6, 10);
                    break;
                case "6":
                    answer = Prime.getQuestionAnswer(100);
                    break;
                default:
                    break;
            }

            System.out.print(answer.getQuestion());
            String answerOfClient = game.next();

            if (answerOfClient.equals(answer.getCorrectAnswer())) {
                System.out.println("Correct!");
                indexOfGames += 1;
            } else {
                System.out.println("'" + answerOfClient + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + answer.getCorrectAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                isAnswerCorrect = false;
            }
        }
        if (indexOfGames == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
        game.close();
    }

}
