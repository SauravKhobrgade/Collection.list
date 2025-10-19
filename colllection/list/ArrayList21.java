package colllection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList21
{
    public static void main(String[] args)
    {
        ArrayList<Emp> al=new ArrayList<Emp>();
        al.add(new Emp(101,"Saurav"));
        al.add(new Emp(201,"Ajay"));
        al.add(new Emp(301,"Vijay"));
        al.add(new Emp(401,"Kartik"));

         ListIterator<Emp> lt=al.listIterator();
        lt.add(new Emp(501,"Samhi"));
        while(lt.hasNext())
        { Emp ee=lt.next();
            if (ee.empName.equals("Ajay"))
            {lt.remove();
            }
            if (ee.empName.equals("Kartik"));
            { lt.set(new Emp(601,"Apii"));
            }
        }
        for ( Emp ee1:al)
        {
            System.out.println(ee1.empId+" - "+ee1.empName);
        }

    }

}
