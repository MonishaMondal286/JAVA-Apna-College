import java.util.*;
public class gpt11 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       if(age>=18){
          System.out.println("eligible for both drive and vote ");
       }
       else if(age>=16){
        System.out.println("only drive");
       }
       else if(age<16 & age<18){
        System.out.println("neither");
       }
    }
}
