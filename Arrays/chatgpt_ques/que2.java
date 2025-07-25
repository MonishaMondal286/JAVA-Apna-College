//Check if Array Contains a Number
// Return true if the array contains the given number.

public class que2 {
    public static boolean CheckEle(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int arr[] = {3,4,5,6,7,8};
        int target = 6;
        boolean index =  CheckEle( arr, target);
        System.out.println(index);
    }


}
