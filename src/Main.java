
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r = 0;
        int p = 1;
        int s = 2;
        int i = 0;
        int wins = 0;
        int losses = 0;
        int[] intmovearray = new int[]{r,p,s};
        while(i < 1) {
            Random randmove = new Random();
            var Rand_item = randmove.nextInt(intmovearray.length);
            var opponentmove = intmovearray[Rand_item];
            Scanner input = new Scanner(System.in);
            System.out.print("Your Move: ");
            String inputint = input.nextLine();
            int play = 10;
            if (inputint.equalsIgnoreCase("rock")) {
                play = 0;
            } else if(inputint.equalsIgnoreCase("paper")) {
                play = 1;
            } else if(inputint.equalsIgnoreCase("scissors")) {
                play = 2;
            }
            int result = opponentmove - play;
            if (result == 0) {
                System.out.println("Opponent's Move: " + opponentmove);
                System.out.println("You Tied. Try Again...");
                System.out.println("SCORE: " + wins + "/" + losses);
            }
            System.out.println("Opponent's Move: " + opponentmove);
            if (result == -1 || result == 2) {
                wins += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: " + wins + "/" + losses);
                System.out.println("You Won! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            } else {
                losses += 1;
                Scanner response = new Scanner(System.in);
                System.out.println("SCORE: " + wins + "/" + losses);
                System.out.println("You Lost! Want to play again? Yes or No ");
                String responsestring = response.nextLine();
                if (responsestring.toLowerCase().contains("no")) {
                    i += 1;
                }
            }
        }
    }}