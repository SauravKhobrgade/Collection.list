package colllection.list;
import java.util.ArrayList;

public class CollectionToArrays
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);

         Object[] op=al.toArray();
       for (Object oo:al)
       {
            Integer ii=(Integer)oo;
           System.out.println(ii);

       }

    }

}
