package colllection.list;
import java.util.ArrayList;
public class ArrayList12
{
    public static void main(String[] args) {
        ArrayList al1 =new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        ArrayList al2=new ArrayList(); //ArrayList 2
        al2.addAll(al1);//addall->add one collection to another collection
        al2.add('X');
        al2.add('S');
        System.out.println(al2);

        System.out.println(al2.addAll(al1));//true
        al2.removeAll(al2);
        System.out.println(al2);//[]
        System.out.println(al2.containsAll(al1));//false
    }
}
