package colllection.list;
import java.util.ArrayList;
public class ArrayList14
{
    public static void main(String[] args)
    {
        // Normal Collections
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        // 1st approche for each loop
        for (Object o: al)
        {    Integer i =(Integer)o;
            System.out.println(i);
        }
        // 2nd approch get() method
        Object o=al.get(2);
        System.out.println(o);

        System.out.println("-----------------------------------------");

        // 3rd  API stream approch
        al.stream().forEach(a-> System.out.println(a));
    }
}
