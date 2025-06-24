// digit frequency

import java.util.*;
public class prac1 {
    public static int getFreq(int num, int d){
        int count = 0;
        while(num>0){
            int dig = num%10;
            num = num/10;
        if(dig == d){
            count++;
           }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = sc.nextInt();
        int f = getFreq(num,d);
        System.out.println(f);
    }
}
