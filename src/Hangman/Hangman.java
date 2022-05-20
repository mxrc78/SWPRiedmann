package Hangman;

import java.util.Scanner;
import java.util.Random;

public class Hangman {

    public static void main(String[] args) {

        System.out.println("Wilkommen bei Hangman");

        /**Declaring the words in an array and declaring scanner**/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String [] words = {"Vorarlberg", "Tirol", "Steiermark", "Oberösterreich"};


        /** Declaring word of the hangman **/

        String wholeWord = words[random.nextInt(words.length)];

        char[] word = new char[wholeWord.length()];
        int[] guess = new int[wholeWord.length()];

        /**random word of the array in console**/

        word = wholeWord.toCharArray();
        System.out.println(wholeWord);



/**
        while (true) {
            int i = 0;
            for (int j = 0; j < wholeWord.length(); j++) {
                if (guess[j] == 1) {
                    System.out.println(word[j]);

            }else
                System.out.println("*");

            }


        }

 **/
        }


    }


