package colllection.list;

public class Swiggy implements Comparable
{   int status;
    int itemId;
     String itemName;
     Swiggy(int itemId,String itemName)
     {    this.itemId=itemId;
         this.itemName=itemName;
     }

    public int compareTo(Object o)
    {   Swiggy s1=(Swiggy)o;
       //int status=itemName.compareTo(s1.itemName);
        return itemName.compareTo(s1.itemName);
    }

   /* public int compareTo(Object o)
    {     Swiggy s1=(Swiggy)o;
        if (itemId==s1.itemId)
        {status=0;
        } else if (itemId<s1.itemId)
        {status=-1;
        } else if (itemId>s1.itemId)
        {status=1;
        }
        return status;
        */

    }

