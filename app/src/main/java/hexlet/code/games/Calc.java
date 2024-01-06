package hexlet.code.games;

import java.awt.*;

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

        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        question.append(firstNum);
        question.append(" ");
        question.append(operator);
        question.append(" ");
        question.append(secondNum);
        question.append("\nYour answer: ");
//                "Question: " + firstNum + " " + operator + " " + secondNum + " \nYour answer: ";
        return new QuestionAnswer(question.toString(), Integer.toString(correctAnswer));
    }
}
