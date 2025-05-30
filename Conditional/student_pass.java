import java.util.*;
public class student_pass {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();
        // if(marks>=33){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("Fail");
        // }


        // or using ternary operator
        int marks = 65;
        String result = (marks>=33) ? "Pass" : "Fail" ;
        System.out.println(result);
    }
}
