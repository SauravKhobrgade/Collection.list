package colllection.list;
import java.util.LinkedList;
public class LinkedList3
{ public static void main(String[] args)
    {
        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add(200);
        System.out.println(ll1);
        LinkedList ll2=new LinkedList<>(ll1);//Constructor Based approched
        ll2.add('A');ll2.add('B');
        System.out.println(ll2);
        LinkedList ll3=new LinkedList();
        ll3.addAll(ll2);// add.All() method
        ll3.add("Saurav");
        ll3.add("Pranit");
        System.out.println(ll3);
    }
}
