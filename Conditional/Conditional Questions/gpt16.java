import java.util.*;
public class gpt16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        System.out.print("Enter attendance : ");
        int attendance = sc.nextInt();
         if(marks >=90 & attendance >=80){
            System.out.println("Excellent");
         }
         else if(marks >=75){
            System.out.println("Good");
         }
         else{
            System.out.println("Need Improvement");
         }
    }
}
