//Find Maximum in Array
 //Return the largest element in the array.

public class que3 {
    public static int LargestEle(int arr[], int element){
        for(int i=0;i<arr.length;i++){
           
            if(element<arr[i]){
                element = arr[i];
            }
            
        }
       return element;
    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,8};
        int element =0;
        int index = LargestEle(arr, element);
        System.out.println(index);
    }
}
