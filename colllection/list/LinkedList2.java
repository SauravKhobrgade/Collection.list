package colllection.list;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList2
{ public static void main(String[] args)
    {
        LinkedList<String> ll1=new LinkedList();
        ll1.add("Saurav");
        ll1.add("Ritesh");
        ll1.add("Suraj");
        System.out.println(ll1);

        Iterator<String> it=ll1.iterator();
         while(it.hasNext())
         {   String ss =it.next();
             System.out.println(ss);
         }
    }
}
