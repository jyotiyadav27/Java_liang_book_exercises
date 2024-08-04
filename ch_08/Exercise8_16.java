//(Sort two-dimensional array) Write a method to sort a two-dimensional array

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_16 {
    public static void sort(int m[][]){

        for(int i=0;i<m.length-1;i++){
            int minRow =m[i][0];
            int minCol = m[i][1];
            int minIndex=i;
            for(int j=i+1;j<m.length;j++){
                if(minRow>m[j][0]){
                    minRow=m[j][0];
                    minCol= m[j][1];
                    minIndex=j;
                } else if (minRow ==m[j][0] && minCol >m[j][1]){
                    minCol= m[j][1];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                m[minIndex][0]=m[i][0];
                m[i][0]=minRow;
                m[minIndex][1]=m[i][1];
                m[i][1]=minCol;
            }
        }
        for(int i=0; i<m.length; i++){
            System.out.println(Arrays.toString(m[i]));
        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = input.nextInt();
        int[][] m = new int[size][2];
        for(int i=0; i<size; i++){
            for(int j=0;j<2;j++){
                m[i][j]= input.nextInt();
            }
        }
        sort(m);


    }

}
