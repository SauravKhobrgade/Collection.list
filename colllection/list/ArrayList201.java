package colllection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayList201
{
    public static void main(String[] args)
    { String[] s={"Saurav","Pravin","Rakesh","Mayur"};
        List<String> al= Arrays.asList(s);

        al.stream().forEach(s1 -> System.out.println(s1));

        for (String ss:s)
        {System.out.println(ss);
        }

    }
}
