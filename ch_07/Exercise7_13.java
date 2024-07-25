import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Exercise7_13 {

    public static int getRandom(int... numbers){

        Random rand = new Random();
        boolean found=false;
        int randomNum;
        do{
            randomNum = rand.nextInt(54)+1;
            for (int n : numbers) {
                if (n == randomNum) {
                    found = true;
                    break;
                } else found = false;
            }
        }while(found);
        return randomNum;
    }

    public static void main(String[] args) {
        int randomNum;
        randomNum= getRandom(5,7,3,9,10);
        System.out.println(randomNum);
    }
}
