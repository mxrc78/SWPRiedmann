package StringHelper;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        char[] marc = word.toCharArray();
        char[] cram = new char[marc.length];

        String drow = "";

        for (int i = 0; i < marc.length - i; i--) {
            cram[i]=marc[marc.length-i];
            drow = cram.toString();
            if (word == drow){
                System.out.println("IsPalindrome");
            }
            else
                System.out.println("IsNoPalindrome");


        }
    }
}
