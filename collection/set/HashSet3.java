package collection.set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet3
{ public static void main(String[] args)
    {
        HashSet<Student> hs1=new HashSet();
        hs1.add(new Student(101,"Saurav"));
        hs1.add(new Student(201, "Rohit"));
        hs1.add(new Student(301,"Manish"));
        hs1.add(new Student(401,"Chetan"));
        Iterator<Student> it=hs1.iterator();
       /* while(it.hasNext())
        {  Student ss=(Student)it.next();
            System.out.println(ss.studId + " - "+ss.studeName);
        }*/
        while(it.hasNext())
        {  Student ss=it.next();
            System.out.println(ss.studId+" - "+ss.studeName);
        }
    }
}
