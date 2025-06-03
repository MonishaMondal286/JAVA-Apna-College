import java.util.*;
public class gpt5 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number : ");
       int n = sc.nextInt();
       if(n/2*2==n){
          System.out.println("even");
       }
       else{
          System.out.println("odd");
       }
    }
}
