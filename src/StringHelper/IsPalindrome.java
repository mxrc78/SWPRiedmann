package StringHelper;

public class IsPalindrome {

    public static void main(String[] args) {

        String word = "anna", reverseStr = "";

        int Length = word.length();

        for (int i = (Length - 1); i >=0; --i) {
            reverseStr = reverseStr + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(word + " is a Palindrome.");
        }
        else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}