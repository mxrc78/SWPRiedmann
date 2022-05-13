package whileloop;

import java.util.Random;

public class whileloop {
    public static void main(String[] args) {

        Random random = new Random();
        int randomnumber = (int) ((Math.random() * 30) + 1);
        int randomnumber2 = (int) ((Math.random() * 30) + 1);

        System.out.println("first randomnumber " + randomnumber2);
        System.out.println("second randomnumber " + randomnumber);

        while (randomnumber2 == 25 | randomnumber2 == 15){
            System.exit(0);
        }

         while (randomnumber == 25 | randomnumber == 15 ){
             System.exit(0);
        }

        System.out.println(randomnumber + randomnumber2);
    }
}

