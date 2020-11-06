import java.util.Scanner;

public class BuzzGame {
    public static void main(String[] args) {
        int numberOfRounds = 1;
        int numberOfQuestions = 1;
        int game;

        System.out.println("Welcome to the BuzzGame!");

        Player player1 = new Player();

        System.out.println("This game is a game of questions and answers.");
        System.out.println("The game takes place in a number of rounds, in which you are called to answer a number of questions.");


        Scanner scanner = new Scanner(System.in);
        int rounds;

        do {
            System.out.println("How many rounds do you want to play?(3-5)");
            rounds = scanner.nextInt();
            if(rounds >= 3 && rounds <= 5) {
                numberOfRounds = rounds;
            }
            else {
                System.out.println("Wrong number for rounds");
            }
        }while(rounds < 3 || rounds > 5);

        System.out.println("Well done! You choose " + rounds + "rounds");

        int quest;
        do {
            System.out.println("How many questions do you want per round?(3-6)");
            quest = scanner.nextInt();
            if(quest >= 3 && quest <= 6) {
                numberOfQuestions = quest;
            }
            else {
                System.out.println("You choose wrong number!Try again.");
            }
        }while(quest < 3 || quest > 6);

        System.out.println("Now you have to answer " + numberOfRounds * numberOfQuestions + " questions.");

        System.out.println("Now you can choose the game type you want.");
        System.out.println("1.CorrectAnswer\n2.Bet");
        game = scanner.nextInt();

        switch (game) {
            case 1:
                System.out.println("Game type : Normal");
                Correct_answer Normal = new Correct_answer(player1, numberOfRounds, numberOfQuestions);
                break;
            case 2:
                System.out.println("Game type : Bet");
                Bet gameBet = new Bet(player1, numberOfRounds, numberOfQuestions);
                break;
        }




    }
}
