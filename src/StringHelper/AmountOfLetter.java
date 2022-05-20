package StringHelper;

public class AmountOfLetter {
    public static void main(String[] args)
    {
        String word = "marc madlener";

        int length = word.split("").length;

        System.out.println("Der String ist " + length + " Zeichen lang.");


    }
}
