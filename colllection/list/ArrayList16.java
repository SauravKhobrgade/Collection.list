package colllection.list;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList16
{ public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        //Normal Cursor
        Iterator it=al.iterator();
        while(it.hasNext())
        {     Integer ii=(Integer)it.next();
            System.out.println(ii);
        }
        //Generric Curson
        Iterator<Integer> iit=al.iterator();
        while(iit.hasNext())
        { Integer iii =iit.next();
            System.out.println(iii);
        }

    }
}
