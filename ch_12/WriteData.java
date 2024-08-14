import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
//        String currentDir = System.getProperty("user.dir");
        java.io.File file = new java.io.File("blank.txt");
        if(file.exists()){
            System.out.println("xxxx");
        }
        java.io.PrintWriter output= new java.io.PrintWriter(file);
        output.print("bhjjgjgjgjjghj");
        output.close();

    }
}
