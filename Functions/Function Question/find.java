// find element in an array

import java.util.*;

public class find {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        int ind = -1;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]== num){
               ind = i;
               break;
            }
        }
        System.out.println(ind);
    }
}
