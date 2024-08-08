//program that prompts the user to enter a sequence of numbers and displays the distinct numbers in the sequence.
//Assume that the input ends with 0 and 0 is not counted as a number in the sequence


import java.util.Scanner;
import java.util.ArrayList;

public class DistintNumbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int value;
        do{
            value = in.nextInt();
            if(!nums.contains(value) && value!=0)
                nums.add(value);
        }while(value!=0);
        System.out.println(nums.toString());
    }
}