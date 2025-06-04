import java.util.*;
public class gpt8 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter and number between "+a+" and "+b+":" );
        int c = sc.nextInt();
        if(c>a || c<b){
            System.out.println(c+" lies between "+a+" and "+b);
        }
        else{
            System.out.println(c+" does not lie between "+a+" and "+b);
        }
    }
}
