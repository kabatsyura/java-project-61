package hexlet.code.games;

import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class Progression {
    public static String getIntro() {
        return "What number is missing in the progression?";
    }
    public static QuestionAnswer getQuestionAnswer() {
        Random rand = new Random();
        int rangeOfProgression = rand.nextInt(6, 10);
        int firstNum = rand.nextInt(1, 10);
        int stepOfProgression = rand.nextInt(1, 10);
        int hiddenNum = rand.nextInt(2, (rangeOfProgression - 1));
        int newNumber = 0;
        int correctAnswer = 0;
        String[] progression = new String[rangeOfProgression];

        for (int i = 0; i < rangeOfProgression; i += 1) {
            if (i == 0) {
                progression[i] = Integer.toString(firstNum);
            } else {
                newNumber = Integer.parseInt(progression[i - 1]) + stepOfProgression;
                progression[i] = Integer.toString(newNumber);
                if (i == hiddenNum - 1) {
                    correctAnswer = newNumber;
                }
            }
        }

        progression[hiddenNum - 1] = "..";

        String progressionInStr = StringUtils.join(progression, " ");
        String question = Progression.buildQuestion(progressionInStr);
        return new QuestionAnswer(question, Integer.toString(correctAnswer));
    }
    private static String buildQuestion(String progressionInStr) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(progressionInStr);
        question.append("\nYour answer: ");

        return question.toString();
    }
}
