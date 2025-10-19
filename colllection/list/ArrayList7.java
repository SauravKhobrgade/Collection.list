package colllection.list;
import java.util.ArrayList;
public class ArrayList7
{
    public static void main(String[] args)
    {
      ArrayList<Emp> ee=new ArrayList<Emp>();
      ee.add(new Emp(101,"Saurav"));
      ee.add(new Emp(201 ,"Vijay"));
      ee.add(new Emp(301,"Satish"));
      //ee.add(100); //Invalid
      for (Emp ep:ee)
      {
          System.out.println(ep.empId+" - "+ ep.empName);
      }
    }
}
