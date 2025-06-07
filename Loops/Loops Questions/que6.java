import java.util.*;
public class que6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        do{
            
            if(n==0){
                break;
            }else{
                System.out.println(n);
            }
        }while(n!=0);
    }
}