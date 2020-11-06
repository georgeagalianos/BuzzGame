import java.util.ArrayList;
import java.util.Scanner;

public class Correct_answer {
    private Player player1;
    private int number_rounds;
    private int number_questRound;

    public Correct_answer(Player player1, int number_rounds, int number_questRound) {
        this.player1 = player1;
        this.number_rounds = number_rounds;
        this.number_questRound = number_questRound;
    }

    private void Game() {
        Questions questions = new Questions();
        ArrayList<Question> roundQuestions;

        Scanner scanner = new Scanner(System.in);

        player1.Player();


        int currentAnswer;

        Question currentQuestion;

        int roundCounter = 1;
        int questionCounter;

        for(int i=0 ; i<number_rounds ; i++) {
            roundQuestions = questions.getQuestions(number_questRound);

            for(;;) {
                //asd
            }
        }

    }
}
