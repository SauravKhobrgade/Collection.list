package colllection.list;
import java.util.ArrayList;
public class ArrayListStream
{
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Saurav");
        al.add("Vijay");
        al.add("Anil");
        al.stream().forEach(s -> System.out.println(s));
    }
}
