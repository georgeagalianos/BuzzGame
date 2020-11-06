import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    Scanner console = new Scanner(System.in);
    private String name;
    private int points;

    public void Player() {
        System.out.print("Enter the name of the player");
        name = console.nextLine();
        points = 0;
    }

    public void addPoints(int point) {
        points += point;
    }
}


