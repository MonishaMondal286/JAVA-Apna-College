import java.util.*;

public class question5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year : ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a leap year");
        }


    }
}
