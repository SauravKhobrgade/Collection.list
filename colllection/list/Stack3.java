package colllection.list;
import java.util.Stack;
public class Stack3
{
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(100);
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st.isEmpty());
    }
}
