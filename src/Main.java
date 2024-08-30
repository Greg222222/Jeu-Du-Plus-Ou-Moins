import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random number = new Random();
        int min = 0;
        int max = 1500;
        int nombreAleatoire = number.nextInt(max - min +1) + min;

        int guess = 1501;
        while (guess != nombreAleatoire) {

            Scanner s = new Scanner(System.in);
            System.out.println("Entrez votre guess");
            guess = s.nextInt();

            if (guess < nombreAleatoire) {
                System.out.println("Vous avez demandé " + guess + " c'est plus");
            }
            else if (guess > nombreAleatoire ) {
                System.out.println("Vous avez demandé " + guess + " c'est moins");
            }
        }
        {
            System.out.println("Vous avez demandé " + guess + " ET C'EST TOUT PILE");
        }

    }

}