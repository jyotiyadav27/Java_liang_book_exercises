import java.io.*;
import java.util.Scanner;
public class ReadData{
    public static void main(String args[]) throws Exception{
        File file = new File("Blanks.txt");
        Scanner in = new Scanner(file);
        if(file.exists()){
            while(in.hasNext()){
                System.out.println(in.next());

            }
        }
    }
}