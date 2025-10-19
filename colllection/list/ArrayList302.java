package colllection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList302
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mumbai");
        al.add("Delhi");
        al.add("Nagpur");
        al.add("Pune");
        al.add("Kolkata");
        System.out.println(al);
        Collections.sort(al); //Sorting
        System.out.println(al);
        for (String ss :al)
        {System.out.println(ss);
        }




    }
}
