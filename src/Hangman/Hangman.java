package Hangman;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {

        System.out.println("Geben sie eine Zahl ein um das Spiel zu starten");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.next();
        String[] randi = getrndmWord();
        String[] marci = guessing();

        System.out.println(String.join("", marci));

    }

    public static String[] getrndmWord() {


        ArrayList<String[]> words = new ArrayList<String[]>();
        words.add(new String[]{"E", "i", "s", "e", "n", "b", "a", "h", "n"});
        words.add(new String[]{"A", "u", "t", "o"});
        words.add(new String[]{"D", "e", "l", "f", "i", "n"});
        words.add(new String[]{"A", "f", "f", "e"});

        String[] word = words.get((int) (Math.random() * words.size()));

        return word;

    }


    public static String[] guessing() {

    }
}


