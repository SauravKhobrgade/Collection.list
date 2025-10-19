package colllection.list;
import java.util.ArrayList;
public class ArrayList10
{
    public static void main(String[] args)
    {
      ArrayList al=new ArrayList();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      System.out.println(al);
      System.out.println(al.contains(20));
      System.out.println(al.contains(100.5f));
      System.out.println(al.isEmpty());
      al.clear();
      System.out.println(al.isEmpty());

    }
}
