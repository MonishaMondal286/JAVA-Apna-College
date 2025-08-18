import java.util.*;

public class builder {
    public static void main(String args[] ){
        // StringBuilder str = new StringBuilder("hello");
        // str.append("world");
        // System.out.print(str);

        // str.setCharAt(0, 'M');
        // System.out.print(str);

        // str.append("Java");
        // System.out.print(str);

        // str.insert(3,20);
        // System.out.print(str);

        // str.deleteCharAt(4);
        // System.out.print(str);


        StringBuilder sb = new StringBuilder("java");
        sb.reverse();
        System.out.print(sb);

        sb.delete(1,3);
        System.out.print(sb);
        


    }
}
