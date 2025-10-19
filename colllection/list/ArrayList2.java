package colllection.list;
import java.util.ArrayList;
public class ArrayList2
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("Cyber"); //String wrapper object
        al.add("Success");
        al.add("Traning");
        System.out.println(al);
        // Extracting data
       for (Object o:al)
        {String ss=(String)o;
            System.out.println(ss);
        }
    }
}
