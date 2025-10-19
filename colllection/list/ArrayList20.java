package colllection.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList20
{ public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("Cyber");
        al.add("Success");
        al.add("Traning");
        al.add("in Pune");
        System.out.println(al);

         ListIterator<String>it=al.listIterator();
         while(it.hasNext())
         {System.out.println(it.next());
         }
         while(it.hasPrevious())
         {System.out.println(it.previous());
         }
    }
}
