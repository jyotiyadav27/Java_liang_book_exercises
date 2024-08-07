import java.io.File;
import java.util.Scanner;


public class DirectorySize {

    public static long getSize(File Dir){
        long size = 0;
        if(Dir.isDirectory()){
            File[] files = Dir.getFiles();
            for(i=0; files!=null && i<files.length; i++){
              size+=  getSize(files[i]);
            }
        } else {
            size += Dir.length();
        }
        return size;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Sring Dir = input.nextLine();

        System.out.println(getSize(new File(Dir)));
    }
}