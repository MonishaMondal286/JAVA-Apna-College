import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int tax;
        if(salary<500000){
            tax = 0;
            System.out.println(tax);
        }
        else if(salary>500000 && salary<1000000){
            tax = (int)(0.20*salary);
            System.out.println(tax);
        }
        else if(salary>1000000){
            tax = (int)(salary*0.30);
            System.out.println(tax);
        }
        else{
            System.out.println("Enter a valid salary");
        }

    }
}
