import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // On randomise un nombre, que l'on va deviner
        Random number = new Random();
        // Il est compris entre un minimum et un maximum
        int min = 0;
        int max = 1500;
        int nombreAleatoire = number.nextInt(max - min +1) + min;
        // Si l'on veut connaître la réponse on peut utiliser :
        // System.out.println(nombreAleatoire);


        // On initialise le nombre que l'utilisateur va entrer (avec une valeur ne pouvant pas être le résultat)
        int guess = 1501;
        // On initialise un comptage pour savoir combien de guess l'utilisateur a fait
        int i = 0;
        // On créé un Scanner
        Scanner s = new Scanner(System.in);
        // Boucle tant que l'utilisateur n'a pas deviné
        while (guess != nombreAleatoire) {
            // On vérifie que l'utilisateur a bien rentré un entier compris entre min et max
            try {
                System.out.println("Entrez votre guess entre 0 et 1500");
                guess = s.nextInt();
                // On incrémente le nombre d'essais
                i++;
                // Puis on vérifie le guess
                if (guess < nombreAleatoire) {
                    System.out.println("Vous avez proposé " + guess + " c'est plus");
                }
                else if (guess > nombreAleatoire ) {
                    System.out.println("Vous avez proposé " + guess + " c'est moins");
                }
            }
            // S'il n'a pas rentré un entier, on le lui fait savoir
            catch (InputMismatchException e) {
               System.out.println("Vous n'avez pas entré un nombre valide");
               // Et on le fait recommencer
               s.next(); // Consomme l'entrée incorrecte
            }
        }
        {
            System.out.println("Vous avez proposé " + guess + " ET C'EST TOUT PILE !! Réussi en " + i + " essais");
        }
        // Fermeture du scanner
        s.close();

    }

}