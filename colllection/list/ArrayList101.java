package colllection.list;

import java.util.ArrayList;

public class ArrayList101
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);

        Integer[] ss=al.toArray(new Integer[al.size()]);
        for (Integer i:ss)
        System.out.println(i);



    }
}
