package colllection.list;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList303
{ public static void main(String[] args)
    {
        ArrayList<Swiggy> al=new ArrayList<Swiggy>();
        al.add(new Swiggy(201,"Niket"));
        al.add(new Swiggy(401,"Prajwal"));
        al.add(new Swiggy(101,"Appi"));
        al.add(new Swiggy(301,"Prachi"));
        Collections.sort(al);
        for (Swiggy s:al)
        {System.out.println(s.itemId+" - "+s.itemName);
        }
    }
}
