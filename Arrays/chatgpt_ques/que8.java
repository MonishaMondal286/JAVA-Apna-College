//Reverse Subarray from Index i to j
//Modify the array to reverse elements between two given indices.

public class que8 {
    public static void ReverseSubArr(int arr[],int i, int j){
       
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7,8};
        int i = 3;
        int j = 6;

        ReverseSubArr(arr,i,j);


        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
