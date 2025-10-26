package collection.Queue;
import java.util.ArrayList;
import java.util.*;
public class Queue1
{ public static void main(String[] args)
    {
      /*  Queue qu=new LinkedList();*/
        Queue qu1=new PriorityQueue();
        qu1.add(30);
        qu1.add(40);
        qu1.add(10);
      //  qu1.add(null);
        //qu1.add("Cyber");
     //   qu1.add(10);
        System.out.println(qu1);
       // qu1.remove();
        System.out.println(qu1);
    }
}