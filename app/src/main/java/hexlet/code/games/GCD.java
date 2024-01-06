package hexlet.code.games;

public class GCD {
    public static String getIntro() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static QuestionAnswer getQuestionAnswer() {
        int maxOfFirstNum = 100;
        int maxOfSecondNum = 50;
        int firstNum = (int) Math.floor(Math.random() * maxOfFirstNum);
        int secondNum = (int) Math.floor(Math.random() * maxOfSecondNum);
        int minNum = Math.min(firstNum, secondNum);
        int correctAnswer = 0;

        for (int i = minNum; i >= 1; i -= 1) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                correctAnswer = i;
                break;
            }
        }

        String question = GCD.buildQuestion(firstNum, secondNum);
        return new QuestionAnswer(question, Integer.toString(correctAnswer));
    }

    private static String buildQuestion(int firstNum, int secondNum) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(firstNum);
        question.append(" ");
        question.append(secondNum);
        question.append("\nYour answer: ");

        return question.toString();
    }
}
