import java.util.*;
public class gpt1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks : ");
        int marks = sc.nextInt();
        if(marks>=90 & marks<=100){
           System.out.println("your grade is A " );
        }
        else if(marks>=80 & marks<=89){
            System.out.println("your grade is B");
        }
        else if(marks>=70 & marks<=79){
            System.out.println("your grade is C");
        }

        else if(marks>=60 & marks<=69){
            System.out.println("your grade is D");
        }
        else if(marks<60){
            System.out.println("your grade is F");
        }
        else{
            System.out.println("Enter correct marks ");
        }

        

    }
}