package hexlet.code.games;

public class Even {
    public static String getIntro() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static QuestionAnswer getQuestionAnswer() {
        int number = (int) Math.floor(Math.random() * 20);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        String question = "Question: " + number + "\nYour answer: ";
        return new QuestionAnswer(question, correctAnswer);
    }
}
