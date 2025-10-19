package colllection.list;
import java.util.ArrayList;
public class ArrayList15
{
    public static void main(String[] args)
    {
      // Generica Collection
      ArrayList<Emp> e=new ArrayList<Emp>();
      e.add(new Emp(101,"Saurav"));

        // 1st approch for loop
          for (Emp ee:e)
          {System.out.println(ee.empId+" _ "+ee.empName + "------> 1st for loop aprroch" );



          // 2nd Approch get() method
           Emp ei=e.get(0);
            System.out.println(ei.empId+" - "+ei.empName +"-----> 2st get()method aprroch");

            //3rd API stream approch
              e.stream().forEach(s-> System.out.println(s.empId+" - "+s.empName + "-----> 3rd stream() approch"));
        }
    }
}
