import java.util.*;

public class question1{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number : ");
       int n = sc.nextInt();
       if(n>=0){
        System.out.println("positive");
       }
       else{
        System.out.println("negative");
       }
    }
}
