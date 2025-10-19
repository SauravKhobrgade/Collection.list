package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSet2
{ public static void main(String[] args)
    {
        LinkedHashSet hs1=new LinkedHashSet();
        hs1.add("Cyber");
        hs1.add("Training");
        hs1.add("Success");
        hs1.add("Pune");
         Iterator<String> it=hs1.iterator();
         while(it.hasNext())
         {  String ss=it.next();
             System.out.println(ss);
         }
    }
}
