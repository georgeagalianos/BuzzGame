import java.util.ArrayList;
import java.util.Collections;

public class Question {
    private String category;
    private String question;
    private String correctAnswer;
    private ArrayList<String> answers;

    public Question(String category, String question, ArrayList<String> answers, String correctAnswer) {
        this.category = category;
        this.answers = new ArrayList<String>();
        this.answers = answers;
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public void shuffleAnswers() {
        Collections.shuffle(answers);
    }
}
