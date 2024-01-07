package hexlet.code.games;

public final class QuestionAnswer {
    private String question;
    private String correctAnswer;

    QuestionAnswer(String setQuestion, String setCorrectAnswer) {
        this.question = setQuestion;
        this.correctAnswer = setCorrectAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public void setCorrectAnswer(String correctAnswer) {
//        this.correctAnswer = correctAnswer;
//    }
}
