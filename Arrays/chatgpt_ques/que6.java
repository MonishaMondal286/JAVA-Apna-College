//Find First and Last Occurrence of a Number
//In a sorted array with duplicates, find the first and last positions of a given number.

public class que6 {

    //finding first occurance(left side)
    public static int FirstEle(int arr[], int ele){
        int start = 0, end  = arr.length-1;
        int firstoccur = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==ele){
                firstoccur = mid;
                end = mid-1;
            }else if(arr[mid]<ele){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return firstoccur;
    }
    
    //finding second occurence(right side)
    public static int SecondEle(int arr[], int ele){
        int start = 0, end = arr.length-1;
        int lastoccur = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==ele){
                lastoccur = mid;
                start = mid+1;
            }else if(arr[mid]<ele){
                start = mid+1;
            }else{
                end =  mid-1;
            }
        }
        return lastoccur;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,3,3,4,5};
        int ele = 3;
        System.out.println(FirstEle(arr, ele));
        System.out.println(SecondEle(arr, ele));
    }
}
