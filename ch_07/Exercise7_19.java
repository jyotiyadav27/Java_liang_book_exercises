import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_19 {
    public static boolean isSorted(int[] arr) {
        boolean sorted = true;
        for(int i =0; i<arr.length-1; i++){

            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted == false)
            return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of items: ");
        int[] arr = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        boolean isSorted= isSorted(arr);
        System.out.println("Array is sorted :"+ isSorted);
    }
}


