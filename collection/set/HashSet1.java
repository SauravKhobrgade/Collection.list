package collection.set;
import java.util.HashSet;
public class HashSet1
{ public static void main(String[] args)
    {HashSet hs=new HashSet();
        hs.add(100);
        hs.add(200);
        hs.add('A');
        hs.add(null);
        hs.add(100);
        System.out.println(hs);
        hs.add(null);
        hs.add("Cyber");
        System.out.println(hs);
    }
}
