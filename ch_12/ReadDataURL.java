import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadDataURL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try{
            URL url = new URL(input);
            Scanner in = new Scanner(url.openStream());
            while(in.hasNext()){
                System.out.println(in.next());
            }
        } catch (MalformedURLException ex){

        } catch (IOException ex){

        }
    }
}