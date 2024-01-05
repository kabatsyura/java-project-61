package hexlet.code.games;

public class Calc {
    public static String getIntro() {
        return "What is the result of the expression?";
    }
    public static QuestionAnswer getQuestionAnswer() {
        char[] operators = {'+', '-', '*'};
        int firstNum = (int) Math.floor(Math.random() * 20);
        int secondNum = (int) Math.floor(Math.random() * 20);
        char operator = operators[(int) Math.floor(Math.random() * operators.length)];
        int correctAnswer = 0;

        switch (operator) {
            case '+':
                correctAnswer = firstNum + secondNum;
                break;
            case '-':
                correctAnswer = firstNum - secondNum;
                break;
            case '*':
                correctAnswer = firstNum * secondNum;
                break;
            default:
                break;
        }

        String question = "Question: " + firstNum + " " + operator + " " + secondNum + " \nYour answer: ";
        return new QuestionAnswer(question, Integer.toString(correctAnswer));
    }
}
