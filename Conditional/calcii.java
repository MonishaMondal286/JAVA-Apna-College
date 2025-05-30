import java.util.*;
public class calcii {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("enter number a : ");
       int a = sc.nextInt();
       System.out.print("enter number b : ");
       int b = sc.nextInt();
       System.out.print("enter any operator : ");
       char operator = sc.next().charAt(0);

       switch(operator){
        case '+' : System.out.println(a+b);
        break;
        case '-' : System.out.println(a-b);
        break;
        case '*' : System.out.println(a*b);
        break;
        case '/' : System.out.println(a/b);
        break;
        case '%' : System.out.println(a%b);

       }
    }
}
