package colllection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList19
{ public static void main(String[] args)
    {   //Generic Collection
        ArrayList<String> al=new ArrayList<String>();
        al.add("Cyber"); al.add("Succeess");
        al.add("Training");
        System.out.println(al);

       //Normal Cursor
        Iterator it =al.iterator();
        while(it.hasNext())
        {  String ss=(String)it.next();
            if (ss.equals("Training"))
            {  it.remove();
            }
        }
        for (String sss:al)
        {System.out.println(sss);
        }
    }
}
