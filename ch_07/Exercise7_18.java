import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_18 {
    public static void bubbleSortArray(int[] arr){
        int temp;
        for(int i =0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped== false)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of items: ");
        int[] arr = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        bubbleSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}


