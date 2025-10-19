package colllection.list;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList304
{ public static void main(String[] args)
    {ArrayList<Flipkart> al=new ArrayList<Flipkart>();
        al.add(new Flipkart(201,"Laptop"));
        al.add(new Flipkart(501,"Mobile"));
        al.add(new Flipkart(101,"Washing Machine"));
        al.add((new Flipkart(301,"Blanket")));

        Collections.sort(al,new ProdId());
        for (Flipkart f:al)
        {System.out.println(f.ProdId+" - "+f.ProdName);
        }
    }
}
