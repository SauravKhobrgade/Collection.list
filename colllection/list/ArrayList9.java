package colllection.list;
import java.util.ArrayList;
public class ArrayList9
{
    public static void main(String[] args)
    {
      ArrayList al=new ArrayList();
      al.add(100);
      al.add(200);
      al.add('x');
      System.out.println(al);

      al.add("Saurav");//without index alywas add at the end
      System.out.println(al);

      al.add(0,"Cyber");//index
      System.out.println(al);

      al.remove(0);
      System.out.println(al); //remove-index

      Integer i=200;
      al.remove(i);
      System.out.println(al);//remove -Object
    }
}
