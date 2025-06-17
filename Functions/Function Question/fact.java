import java.util.*;
public class fact {
    public static int factorial(int num){
        int bag = 1;
        for(int i=1;i<=num;i++){
            bag = bag*i;
        }
        return bag;
    }

    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println(result);
        
        sc.close();
    }
}
