package colllection.list;
import java.util.Stack;
public class Stack2
{ public static void main(String[] args)
    {
        Stack st=new Stack();
        st.push(100);
        st.push(200);
        st.push(300);
        System.out.println(st);
        System.out.println(st.peek());
        Stack st1=new Stack();
        st1.push('A');st1.push('B');
        st1.push(100);st1.push(200);
        System.out.println(st1);
        System.out.println(st1.pop());
        System.out.println(st1);

    }
}
