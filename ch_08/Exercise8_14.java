//Explore matrix) Write a program that prompts the user to enter the length of a square matrix,
//        randomly fills in 0s and 1s into the matrix,
//        prints the matrix, and finds the rows, columns, and diagonals with all 0s or 1s.


import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter size:");
        int size = input.nextInt();
        double[][] m = new double[size][size];
        for(int i=0; i<size; i++){
            for(int j=0;j<size;j++){
                m[i][j]= (int)(Math.random()*2);
            }
        }
        int[] sumRow= new int[size];
        for(int i=0; i<size; i++){
            for(int j=0;j<size;j++){
                sumRow[i]+=m[i][j];
            }
            if(sumRow[i]==)
        }
        int[] sumCol= new int[size];
        for(int i=0; i<size; i++){
            for(int j=0;j<size;j++){
                sumCol[i]+=m[j][i];
            }
        }


        System.out.println(Arrays.toString(m));
    }

}
