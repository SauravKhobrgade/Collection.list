package colllection.list;
import java.util.Vector;
public class Vector3
{ public static void main(String[] args)
    {
        Vector vv=new Vector();
        vv.add(100);vv.add(200);vv.add(100);
        vv.add(300);vv.add(400);
        System.out.println(vv.size());
        System.out.println(vv.capacity());
        vv.add(500);vv.add(700);vv.add(900);vv.add(1000);vv.add(100);vv.add(1200);
        System.out.println(vv.size());
        System.out.println(vv.capacity());
    }
}
