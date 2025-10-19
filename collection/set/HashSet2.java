package collection.set;
import java.util.HashSet;
public class HashSet2
{ public static void main(String[] args) {
        HashSet hs1 =new HashSet();
        hs1.add(100);
        hs1.add(300);
        hs1.add('A');
        System.out.println(hs1);
        HashSet hs2=new HashSet(hs1);//Constructor Based approched
        hs2.add("Cyber");
        hs2.add(2000);
        System.out.println(hs2);
        HashSet hs3=new HashSet();
        hs3.addAll(hs2);// addAll() method approched
        hs3.add("Saurav");
        hs3.add(null);
        System.out.println(hs3);
    }
}
