package hexlet.code.games;

public class Even {
    public static String getIntro() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static QuestionAnswer getQuestionAnswer(int rangeMax) {
        int number = (int) Math.floor(Math.random() * rangeMax);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        String question = Even.buildQuestion(number);
        return new QuestionAnswer(question.toString(), correctAnswer);
    }

    private static String buildQuestion(int number) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(number);
        question.append("\nYour answer: ");

        return question.toString();
    }
}
