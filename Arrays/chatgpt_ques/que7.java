//Reverse Array In-place
//Write a method to reverse the array without using extra space.

public class que7 {
    public static void RevArray(int arr[]){
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,5,6};
        
        RevArray( arr);
        
       for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+ " ");
        }
         
    }
}
