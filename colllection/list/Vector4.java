package colllection.list;
import java.util.Vector;
public class Vector4
{ public static void main(String[] args)
    {
        Vector vv=new Vector(5,4);
        vv.add(100);  vv.add(300);  vv.add(200);
        vv.add(500);
        System.out.println(vv.size());
        System.out.println(vv.capacity());
        vv.add(500);   vv.add("Cyber");
        System.out.println(vv.size());
        System.out.println(vv.capacity());
    }
}
