package random_number;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;


        Random random = new Random();

        int value = random.nextInt(max + min) + min;
        System.out.println(value);

        int value1 = random.nextInt(max + min) + min;
        System.out.println(value1);

        if (value < value1 && value < 50) {
            System.out.println("Zahl1 ist kleiner als Zahl2 und Minni");
        }

        if (value < 50 && value1 != 0) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }



    }
}