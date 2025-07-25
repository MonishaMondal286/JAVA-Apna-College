//Find Second Largest Element
// Return the second largest unique element in the array.

public class que4 {
    public static int SecondLarg(int arr[]){
        int larg = Integer.MIN_VALUE;
        int seclarg = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           if(arr[i]>larg){
            seclarg = larg;
            larg = arr[i];
           }
           else if(arr[i]>seclarg && arr[i]!=larg){
            seclarg = arr[i];
           }
        }

        return seclarg;
    }

    public static void main(String args[]){
        int arr[] = {2,3,5,6,7,8};
        int index = SecondLarg(arr);
        System.out.println(index);
    }
}
