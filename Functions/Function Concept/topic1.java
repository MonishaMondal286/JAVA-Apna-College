import java.util.*;
public class topic1{
    public static void printHello(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        
    }
    
    public static int calculate_sum(int num1,int num2){
        
        int sum = num1+num2;
        return sum;
    }

    public static void main(String args[]){
          printHello();
          Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate_sum(a, b);
        System.out.println(sum);
    }
} 