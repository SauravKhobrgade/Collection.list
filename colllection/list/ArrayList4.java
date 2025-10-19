package colllection.list;

import java.util.ArrayList;

public class ArrayList4
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add(new Emp(101,"Vijay"));
        al.add(new Emp(102,"Ajay"));
        al.add(new Emp(103,"Kanava"));
        for (Object o:al)
        {
             Emp e=(Emp)o;
            System.out.println(e.empId+"-"+e.empName);
        }

    }
}
