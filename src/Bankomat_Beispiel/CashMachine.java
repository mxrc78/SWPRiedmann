package Bankomat_Beispiel;

import java.util.Scanner;

import static java.lang.System.exit;

public class CashMachine {
    public static void main(String[] args) {

        int x;
        int a = 1000;

        while (true){
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();


            if (selection == 1) {
                System.out.println("Wieviel Geld möchten sie abheben?");
                x = scanner.nextInt();
                a -=x;
                System.out.println(a);

            }


            if (selection == 2) {
                System.out.println("Wieviel Geld möchten sie einzahlen?");
                x = scanner.nextInt();
                a+=x;
                System.out.println(a);
            }


            if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt  " + a + "  Euro");
            }

            if (selection == 4) {
                System.out.println("Beendet");
                exit(0);
            }
        }

        }

    }








