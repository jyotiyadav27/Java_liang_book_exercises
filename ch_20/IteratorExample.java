
//To iterate a string collection
import java.util.*;

public class IteratorExample{
    public static void main(String[] args){
        Collection<String> c1 = new ArrayList<String>();
        c1.add("jyoti");
        c1.add("boby");
        System.out.println(c1);
        Iterator<String> it = c1.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toUpperCase()+" ");
        }
//        for( String c: c1){
//            System.out.println(c.toUpperCase()+" ");
//        }

    }
}