import java.util.*;
public class que13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            
        }
        System.out.println("factorial of the number is : "+ fact);
    }
}
