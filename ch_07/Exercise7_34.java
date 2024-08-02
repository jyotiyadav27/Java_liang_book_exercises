import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_34 {

    public static String sort(String s){

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];

        int low=0, high=arr.length-1;

        for (int i =0;i< arr.length; i++)
            arr[i] = input.nextInt();
        int pivot = arr[0];
        boolean equals = false;

        while(low<high && equals){
            while(arr[high]>pivot)
            {   if(low==)
                high--;
            }
            while(arr[low]<=pivot)
                low--;

            int temp;
            temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }
        if(low==high){
            int temp;
            temp= arr[low];
            arr[low]=arr[0];
            arr[0]=temp;
        }

    }
}
