import java.io.*;

import java.util.*;

public class countKeywords{
    public static void main(String[] args) throws Exception{
        File file = new File("blank.txt");
        String[] keys = {"hello", "buffalo"};
        Set<String> s = new HashSet<>(Arrays.asList(keys));
        Scanner input= new Scanner(file);
        int count = 0;
        while(input.hasNext()){
            String word = input.next();
            if(s.contains(word))
                count++;
        }
        System.out.println(count);
    }
}