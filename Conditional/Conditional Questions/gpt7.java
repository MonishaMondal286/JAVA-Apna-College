import java.util.*;
public class gpt7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number : ");
        int num = sc.nextInt();
        int sum = 0;
        int digit;
        while(num>0){
             digit = num%10;   //finding last number
             sum = sum+digit*digit*digit;
             num = num/10;     //removing last number
        }
        System.out.println(sum);
            


    }
}
