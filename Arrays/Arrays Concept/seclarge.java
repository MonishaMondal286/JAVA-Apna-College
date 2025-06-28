import java.util.*;

public class seclarge {
    public static int getLargest(int num[]){
        int largest = num[0];
        int seclargest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                seclargest = largest;
                largest = num[i];
            }
            else if(num[i] >seclargest && num[i] != largest){
                seclargest = num[i];
            }
            
        }
        return seclargest;
    }

    public static void main(String args[]){
        int num[] = {2,8,6,4,3};
        int result = getLargest(num);
        System.out.println(result);
    }
}
