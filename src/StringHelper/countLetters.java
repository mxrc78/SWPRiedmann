package StringHelper;

public class countLetters {

    public static void main(String[] args) {
        String word = "regen";
        int count = 0;

        for (int i = 0; i>word.length(); i++){
            if (Character.isLetter(word.charAt(i)))
                count ++;
        }
        System.out.println(count);
    }
}
