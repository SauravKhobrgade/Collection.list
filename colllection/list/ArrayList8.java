package colllection.list;
import java.util.ArrayList;
public class ArrayList8
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        System.out.println(al);
        al.add(100);
        al.add("Saurav");
        al.add("False");
        System.out.println(al);
    }
}
//Wherever we print collection it will not envolk toString() method overrriden in collection class
//but it will also envolk the toString() method of object class which are present in the collectiom class.