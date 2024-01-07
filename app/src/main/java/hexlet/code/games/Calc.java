package hexlet.code.games;

public class Calc {
    public static String getIntro() {
        return "What is the result of the expression?";
    }
    public static QuestionAnswer getQuestionAnswer() {
        final int rangeMax = 20;
        char[] operators = {'+', '-', '*'};
        int firstNum = (int) Math.floor(Math.random() * rangeMax);
        int secondNum = (int) Math.floor(Math.random() * rangeMax);
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

        String question = Calc.buildQuestion(firstNum, secondNum, operator);
        return new QuestionAnswer(question.toString(), Integer.toString(correctAnswer));
    }

    private static String buildQuestion(int firstNum, int secondNum, char operator) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(firstNum);
        question.append(" ");
        question.append(operator);
        question.append(" ");
        question.append(secondNum);
        question.append("\nYour answer: ");

        return question.toString();
    }
}
