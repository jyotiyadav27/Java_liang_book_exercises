import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_12 {
    public static int[] reverse(int[] arr){
        int[] revArr = new int[10];
        for (int i =0, j=9; i<10; i++, j--){
            revArr[i]=arr[j];
        }
        return revArr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int[] revArr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        revArr= reverse(arr);
        System.out.println(Arrays.toString(revArr));
    }
}
