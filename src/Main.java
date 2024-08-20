
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;
        Enumstuff[] intmovearray = Enumstuff.values();
        do{
            Random randmove = new Random();
            var Rand_item = randmove.nextInt(intmovearray.length);
            Enumstuff opponentmove = intmovearray[Rand_item];
            Scanner input = new Scanner(System.in);
            System.out.print("Your_Move: ");
            String inputint = input.nextLine();
            int play;
            if (inputint.equalsIgnoreCase("rock")) {
                play = 0;
            } else if(inputint.equalsIgnoreCase("paper")) {
                play = 1;
            } else if(inputint.equalsIgnoreCase("scissors")) {
                play = 2;
            } else {
                System.out.println("Not a vaild move.");
                continue;
            }
            int result = opponentmove.compareNumber - play;
            System.out.println("Opponent's Move: " + opponentmove.moveName);
            if (result == 0) {
                System.out.println("You Tied. Try Again...");
                System.out.println("SCORE: " + wins + "/" + losses);
            } else if (result == -1 || result == 2) {
                wins += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: " + wins + "/" + losses);
                System.out.println("You Won! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    break;
                }
            } else {
                losses += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: " + wins + "/" + losses);
                System.out.println("You Lost! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    break;
                }
            }
        }while(true);
    }
}