package colllection.list;
import java.util.ArrayList;
public class ArrayList5
 {
     public static void main(String[] args)
     { ArrayList al=new ArrayList();
         al.add("Cyber");//String
         al.add(100);//Integer
         al.add(new Emp(101,"Vijat"));
         for (Object o:al)
         {
             if (o instanceof String)
             {  String ss=(String)o;
                 System.out.println(ss);
             }
             else if (o instanceof Integer)
             {  Integer ii=(Integer)o;
                 System.out.println(ii);
             }
             else if (o instanceof Emp)
             {   Emp ee=(Emp)o;
                 System.out.println(ee.empId+ "-"+ee.empName);
             }

         }
     }
}
