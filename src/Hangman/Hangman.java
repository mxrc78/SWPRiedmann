package Hangman;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {

        System.out.println("Geben sie eine Zahl ein um das Spiel zu starten");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.next();
        String[] marc = getrndmWord();



    }

    public static String[] getrndmWord() {

        ArrayList<String[]> words = new ArrayList<String[]>();
        words.add(new String[]{"E", "i", " ", " ", "n", "b", " ", "h", "n"});
        words.add(new String[]{"A", "u" ,"", ""});
        words.add(new String[]{"D", "", " l", "f ", " ", "n"});
        words.add(new String[]{"A", "f", " ", " "});


        String[] word = words.get((int) (Math.random() * words.size()));

        return word;

        System.out.println(word);
    }


}
