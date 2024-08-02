//(Sum elements column by column) Write a method that returns the sum of all the elements in a
// specified column in a matrix


import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_1 {
    public static void sumColumn(double[][] m) {
        double[] sum =new double[]{0,0,0,0};
        for(int j=0;j<4;j++){
            for(int i=0; i<3; i++){
                sum[j]= sum[j]+ m[i][j];
            }
        }

        System.out.println(Arrays.toString(sum));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        for(int i=0; i<3; i++){
            for(int j=0;j<4;j++){
                matrix[i][j]= input.nextDouble();
            }
        }
        sumColumn(matrix);
    }

}
