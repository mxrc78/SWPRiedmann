package dicegame;

import java.util.Random;
import java.util.Scanner;

public class dicegame {
    public static void main(String[] args) {


            System.out.println("Geben sie 1 ein um das Spiel zu starten");


        while (true) {

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();


            int randomnumber = random.nextInt(30) +6;
            int ratz = random.nextInt(30) +6;

            if (selection == 1) {
                System.out.println( "Spieler: " + randomnumber);
                System.out.println( "Computer: " + ratz);
                System.out.println("--------------------------------");
                if (randomnumber > ratz) {
                    System.out.println("Spieler hat gewonnen");
                }
                else {
                    System.out.println("Computer hat gewonnen");
                }

            }

        }

    }
}
