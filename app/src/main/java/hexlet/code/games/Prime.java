package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String getIntro() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static QuestionAnswer getQuestionAnswer() {
        Random rand = new Random();
        int rangeMax = 100;
        int number = rand.nextInt(2, rangeMax);
        boolean isPrime = true;

        for (int i = 2; i < number && isPrime; i += 1) {
            isPrime = number % i != 0;
        }

        String correctAnswer = isPrime ? "yes" : "no";
        String question = Prime.buildQuestion(number);
        return new QuestionAnswer(question, correctAnswer);
    }
    private static String buildQuestion(int number) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(number);
        question.append("\nYour answer: ");

        return question.toString();
    }
}
