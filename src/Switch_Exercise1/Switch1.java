package Switch_Exercise1;

import java.util.Random;

public class Switch1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(5)+5;

        switch (randomnumber){
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }

    }

}
