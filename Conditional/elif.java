import java.util.*;
public class elif {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            System.out.println("not an adult");
        }
        else if(age>18 || age<60){
            System.out.println("adult");
        }
        else{
             System.out.println("senior citizen");
        }
    }
}
