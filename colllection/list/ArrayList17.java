package colllection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17
{
    public static void main(String[] args)
    {   //Generic Collection
        ArrayList<Character> al=new ArrayList<Character>();
        al.add('A');
        al.add('B');
        al.add('C');
        System.out.println(al);

        //Normal Cursor
           Iterator it =al.iterator();
           while(it.hasNext())
           {  Character cc1=(Character)it.next();
               System.out.println(cc1);
           }
        // Generic Curson
           Iterator<Character> itg=al.iterator();
           while(itg.hasNext())
           { Character cc2 =itg.next();
               System.out.println(cc2);
           }

    }
}
