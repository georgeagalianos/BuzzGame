import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    Scanner read = new Scanner(System.in);
    private String name;
    private int points;
    private int bid;
    private int wins;

    public Player() {
        System.out.print("Enter your name : ");
        String aname = read.nextLine();
        this.name = aname;
        System.out.println("hello " + name + "\n" + "Welcome to the BuzzGame.");
        this.points = 0;
        this.wins = 0;
    }

    public String getName() { return this.name; }

    public int getPoints() { return this.points; }

    public int addPoints(int point) {
        return this.points += point;
    }

    public void setBid(int bid) { this.bid = bid; }

    public int getBid() { return this.bid; }
}


