//Binary Search for Target Element
//Return index of the element using binary search. Return -1 if not found.

public class que5 {
    public static int BinSearch(int arr[], int element){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==element){
                return element;
            }
            else if(arr[mid]<element){
                return arr[mid]-1;
            }
            else{
                return arr[mid+1];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {3,4,5,6,7,8};
        int element = 7;
        int result = BinSearch(arr, element);

        if(result!=-1){
            System.out.println("number found at index "+ result);
        }
        else{
            System.out.println("number not found ");
        }
    }
}
