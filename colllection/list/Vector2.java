package colllection.list;
import java.util.Vector;
public class Vector2
{ public static void main(String[] args)
   {
       Vector vv1=new Vector();
       vv1.add(100);
       vv1.add(200);
       Vector vv2=new Vector(vv1);
       vv2.add('X');
       vv2.add("Y");
       System.out.println(vv2);
       Vector vv3=new Vector();
       vv3.addAll(vv2);
       vv3.add("Cyber");
       vv3.add("Success");
       System.out.println(vv3);

    }
}
