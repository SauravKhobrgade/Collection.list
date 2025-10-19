package collection.set;
import java.util.LinkedHashSet;
public class LinkedHashSet1
{ public static void main(String[] args)
   {
       LinkedHashSet lhs=new LinkedHashSet();
       lhs.add(100);
       lhs.add("Cyber");
       lhs.add(200); lhs.add(200);
       lhs.add(null);
       lhs.add('A');
       System.out.println(lhs);


    }
}
