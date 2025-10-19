package colllection.list;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList301
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add(400);
        al.add(200);
        al.add(100);
        al.add(300);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        al.stream().forEach(s1-> System.out.println(s1));
        for (Object o:al)
        {   Integer ii =(Integer)o;
            System.out.println(ii);
        }

    }
}
