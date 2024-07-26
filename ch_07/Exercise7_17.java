import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Exercise7_17 {

    public static void sortArray(String[] students, int[] scores){
        String temp;
        for(int i =0; i<scores.length-1; i++){
            int currentMax = scores[i];
            int currentMaxIndex = i;
            for(int j=i+1; j<scores.length; j++){
                if(currentMax<scores[j]){
                    currentMax = scores[j];
                    currentMaxIndex=j;
                }
            }

            if(currentMaxIndex!=i){
                temp = students[currentMaxIndex];
                students[currentMaxIndex] = students[i];
                students[i]=temp;
                scores[currentMaxIndex] = scores[i];
                scores[i]= currentMax;

            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter a student name:");
            students[i] = input.next();
            System.out.print("Enter the students score:");
            scores[i] = input.nextInt();
        }
        sortArray(students, scores);
        System.out.println(Arrays.toString(students));
    }
}

