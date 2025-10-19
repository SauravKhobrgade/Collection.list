package colllection.list;
import java.util.Comparator;
public class ProdId implements Comparator<Flipkart>
{   int status;
    //Generic Cursur
    public int compare(Flipkart f1,Flipkart f2)
    {  if (f1.ProdId==f2.ProdId)
      {  status=0;
      }
      else if (f1.ProdId>f2.ProdId)
       {  status=1;
       }
      else if (f1.ProdId<f2.ProdId)
       {  status=-1;
       }
        return status;
    }


    //Normal Cursor
 /*   public int compare(Object o1, Object o2)
    {   Flipkart f1=(Flipkart)o1;
        Flipkart f2=(Flipkart)o1;
        return 0;
    }
  */
}