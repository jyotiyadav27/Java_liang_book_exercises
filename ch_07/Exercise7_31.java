import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_31 {

    public static int[] merge(int[] list1, int[] list2){
        int[] list3 = new int[list1.length + list2.length];
        int i=0, j=0, k=0;
        while(i<list1.length && j<list2.length){
            if(list1[i]>list2[j])
            {
                list3[k++]= list2[j++];
            } else list3[k++]= list1[i++];
        }
        while(i<list1.length)
            list3[k++]= list1[i++];
        while(j<list2.length)
            list3[k++]= list2[j++];
        return list3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of items for array 1: ");
        int[] arr1 = new int[input.nextInt()];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println("Enter no. of items for array 2: ");
        int[] arr2 = new int[input.nextInt()];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();

        }
        int[] arr3 = new int[arr1.length+arr2.length];
        arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }
}
