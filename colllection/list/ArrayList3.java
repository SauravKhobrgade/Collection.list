package colllection.list;
import java.util.ArrayList;
public class ArrayList3
{
    public static void main(String[] args)
    {
        Emp e1=new Emp(101,"Vijay");
        Emp e2=new Emp(102,"Satish");
        Emp e3=new Emp(103,"Arjun");
        ArrayList al=new ArrayList();
        al.add(e1);al.add(e2);al.add(e3);
        for(Object o:al)
        {      Emp e=(Emp)o;
            System.out.println(e.empId+"-"+e.empName);
        }
    }
}
