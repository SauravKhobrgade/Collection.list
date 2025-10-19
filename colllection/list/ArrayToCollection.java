package colllection.list;
import java.util.*;
public class ArrayToCollection
{
    public static void main(String[] args)
    {
        Integer[] i={10,20,30,40};
        List<Integer> li=new ArrayList<>(Arrays.asList(i));
        li.add(50);
        li.remove(1);
        System.out.println(li);
    }
}
