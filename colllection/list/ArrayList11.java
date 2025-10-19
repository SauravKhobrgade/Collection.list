package colllection.list;
import java.util.ArrayList;
public class ArrayList11
{
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        System.out.println(al1);
        ArrayList al2=new ArrayList();
        al2.addAll(al1);
        al2.add('X');
        al2.add('W');
        System.out.println(al2);
    }
}
