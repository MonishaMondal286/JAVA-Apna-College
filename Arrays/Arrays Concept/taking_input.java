import java.util.*;

public class taking_input {
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[1] = 100;
        System.out.println("updated chem marks : "+marks[1]);
        
        int percentage = ((marks[0]+marks[1]+marks[2])/3);
        System.out.println(percentage);

        sc.close();
    }
}
