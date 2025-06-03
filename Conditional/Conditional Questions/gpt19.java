import java.util.*;
public class gpt19 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first side : ");
       int x = sc.nextInt();
       System.out.print("Enter second side : ");
       int y = sc.nextInt();
       System.out.print("Enter third side : ");
       int z = sc.nextInt();
    if(x==y || y==z || x==z){
        System.out.println("Equilateral Trianlge");
    }
    else if(x!=y || y!=z || x!=z){
        System.out.println("Scalene Triangle");
    }
    else if(x==y || x==z || y!=z){
        System.out.println("Isosceles Triangle");
    }
    else{
        System.out.println("Enter valid side ");
    }
       
    }
}
