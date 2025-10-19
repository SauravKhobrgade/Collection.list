package collection.set;
import java.util.TreeSet;
public class TreeSet1
{ public static void main(String[] args)
   {
       TreeSet ts=new TreeSet();
       ts.add(100);
       ts.add(200);
       ts.add(300);
       System.out.println(ts);
       ts.add("Cyber");
       ts.add(null);
       System.out.println(ts);
    }
}
