package VII_tablice_i_ArrList.zadania.zad_19;

public class Question {

    String question, answer_1, answer_2, answer_3, answer_4;
    int correctAnswer;

    public Question(String question, String answer_1, String answer_2, String answer_3,
                    String answer_4, int correctAnswer) {
        this.question = question;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
