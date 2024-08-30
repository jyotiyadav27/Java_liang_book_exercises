import java.util.*;

public class countOccureneceWords{
    public static void main(String[] args){
        Map<String, Integer> m = new TreeMap<>();
        String s = "life is amazing or what is life";
        String[] s1= s.split(" ");
        for(String str:s1){
            if(!m.containsKey(str)){
                m.put(str,1);

            } else {
                int value = m.get(str);
                value++;
                m.put(str, value);}
        }
        Set<Map.Entry<String, Integer>> entrySet = m.entrySet();
        for(Map.Entry<String, Integer> e1:entrySet){
            System.out.println(e1.getKey()+" "+e1.getValue());
        }


    }
}