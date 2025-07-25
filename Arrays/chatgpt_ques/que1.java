//Find Element in Array
// Write a method that returns the index of a target element in an array. Return -1 if not found.


public class que1{
    public static int FindEle(int arr[], int target){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            
         }
         return -1;
    }

    public static void main(String args[]){
        int arr[] = {3,4,5,6,7,8};
        int target = 6;
        int index = FindEle(arr, target);
        
        if(index!=-1){
            System.out.println("number found at index "+ index);
        }
        else{
            System.out.println("number not found");
        }
    }
}
