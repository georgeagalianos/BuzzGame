import java.util.ArrayList;
import java.util.Scanner;

public class Bet {
    Scanner console = new Scanner(System.in);
    private int points=0;
    private Player player;
    private int number_rounds;
    private int number_questions;

    public Bet(Player player, int numRounds, int numQuestions){
        this.player = player;
        this.number_rounds = numRounds;
        this.number_questions = numQuestions;
        Game();
    }

    private void Game() {
        Questions questions = new Questions();
        ArrayList<Question> roundQuestions;

        Scanner scanner = new Scanner(System.in);

        int currentAnswer;

        Question currentQuestion;

        int roundCounter = 1;
        int questionCounter;

        for(int i=0 ; i<number_rounds ; i++) {
            roundQuestions = questions.getQuestions(number_questions);
            System.out.println("Round " + roundCounter);
            roundCounter++;

            questionCounter = 1;

            for(int j=0 ; j<number_questions ; j++) {
                System.out.println("Question :" + questionCounter);
                System.out.print(player.getName() + "\'s points" + player.getPoints() + "\n");

                currentQuestion = roundQuestions.get(j);

                currentQuestion.printCategory();

                System.out.println("How much do you want to bid in this category?");
                System.out.println("1:250\t2:500\t3:750\t4:1000");
                int bider = scanner.nextInt();
                switch(bider) {
                    case 1:
                        player.setBid(250);
                        break;
                    case 2:
                        player.setBid(500);
                        break;
                    case 3:
                        player.setBid(750);
                        break;
                    case 4:
                        player.setBid(1000);
                        break;
                }

                currentQuestion.printQuestion();
                currentQuestion.printAnswers();

                System.out.println("Give an answer : ");
                currentAnswer = scanner.nextInt();

                if(currentAnswer == currentQuestion.getCorrectAnswer()) {
                    player.addPoints(player.getBid());
                }
                else {
                    player.addPoints(-player.getBid());
                }
                questionCounter++;
            }
        }
        scanner.close();
        System.out.println("Your scor : " + player.getPoints());
    }


}