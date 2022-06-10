package Coffemachine;
import java.util.Scanner;

public class Coffemachine {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            int x = 0;
            int amountOfwater = 1000;
            int amountOfbeens = 200;
/**
 * selection 1 == Maschine einschalten
 * selection 2 == auswahl der Kaffeanzahl
 * selection 3 == auswahl der Stärke vom Kaffe
 * selection 4 == Wasser auffüllen
 * selection 5 == Bohnen auffüllen
 *
 */


            if (selection == 1) {
                System.out.println("Coffemachine is now on");

            }

            if (selection == 2)   {
                System.out.println("Wählen sie einen Kaffe zwischen 40 und 200ml aus");
                x = scanner.nextInt();
                System.out.println(x + "ml Coffee is coming out");
                amountOfwater = 1000 -x;
                System.out.println("Das Wasser wurde auf " +amountOfwater + " reduziert");
            }


            if (selection == 3 && x < 10) {
                System.out.println("Die Stärke des Caffees einstellen zwischen 1 und 10");
                x = scanner.nextInt();
                System.out.println("Sie haben die Stärke " + x + " ausgewählt");
                amountOfbeens = amountOfbeens -( 5 * x);
                System.out.println("Die Bohnen wurden " + amountOfbeens + "reduziert");



            }

            if (selection == 4) {
                System.out.println("Wasser wird nachgefüllt");
                amountOfwater = 1000;
                System.out.println("Wasser wurde auf" + amountOfwater + " ml nachgefüllt");
            }
                if (selection == 5) {
                    System.out.println("Bohnen werden nachgefüllt");
                    amountOfbeens = 200;
                    System.out.println("Bohnen wurden auf" + amountOfbeens + " Bohnen nachgefüllt");

                }


                if (selection == 7) {
                    System.exit(0);
                }

            }
        }
    }


