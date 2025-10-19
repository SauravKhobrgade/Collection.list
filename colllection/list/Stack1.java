package colllection.list;
import java.util.Stack;
import java.util.Vector;

public class Stack1
{ public static void main(String[] args)
    {
        Stack st=new Stack();
        st.push(100);
        st.push(200);
        st.push(400);
        System.out.println(st);
        st.push("Saurav");
        st.push(null);
        st.push(100);
        System.out.println(st);


    }
}
