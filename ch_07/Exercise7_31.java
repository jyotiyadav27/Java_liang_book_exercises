import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_20 {

    public static void reverseSelectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            // Swap list[i] with list[currentMaxIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of items: ");
        double[] arr = new double[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        reverseSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
