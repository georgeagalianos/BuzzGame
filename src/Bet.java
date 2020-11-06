public class Bet {import java.util.Scanner;

public class Bet {
    Scanner console = new Scanner(System.in);
    private int coins=0;
    private Player player1;
   public void BET(Player player1,){
       this.player1=player1;
       boolean flag=false;
       do{
           System.out.print("Enter the coins of the bet:");
           coins= console.nextInt();
           if(coins!=250 || coins!=500 || coins!=750 || coins!=1000)
           {
                System.out.println("DEN YPARXEI TETOI POSO NA PONTARETE");
           }
           else{
               flag=true;
           }
         }while(flag==true);

   }

   public void ANSWER(boolean flag){
      if(flag==true){
          player1.addPoints(coins);
      }
      else {
          player1.addPoints(-coins);
      }
   }


}

}
