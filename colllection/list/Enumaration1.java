package colllection.list;
import java.util.Enumeration;
import java.util.Vector;
import  java.util.Vector;
public class Enumaration1
{
    public static void main(String[] args)
    {
        Vector vt=new Vector();
        vt.add(10);
        vt.add(20);
        vt.add(30);
        System.out.println(vt);

       Enumeration ee= vt.elements();
       while (ee.hasMoreElements())
       {
           Integer ii=(Integer)ee.nextElement();
           System.out.println(ii);
       }
    }
}
