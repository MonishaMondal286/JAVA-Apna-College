import java.util.*;
public class while_ex2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = sc.nextInt();
        int count = 1;
        while(count<=number){
            System.out.println(count);
            count++;
        }

    }
}
