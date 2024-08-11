import java.util.*;

public class TesyQueue{
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        q.offer("hhjhj");
        q.offer("hhxhj");
        while(q.size()>0){
            System.out.println(q.remove()+" ");
        }


    }
}