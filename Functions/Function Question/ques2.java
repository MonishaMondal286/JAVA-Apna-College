import java.util.*;
public class ques2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
        
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    
    
}
