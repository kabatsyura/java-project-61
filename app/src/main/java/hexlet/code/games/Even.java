package hexlet.code.games;

public class Even {
    public static String getIntro() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static QuestionAnswer getQuestionAnswer() {
        int number = (int) Math.floor(Math.random() * 20);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(number);
        question.append("\nYour answer: ");
        return new QuestionAnswer(question.toString(), correctAnswer);
    }
}