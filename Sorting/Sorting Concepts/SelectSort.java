public class SelectSort{
    public static void SelSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            
            }
                //swap 
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
       
    }

    public static void main(String args[]){
        int arr[] = {3,2,1,4,5};
        SelSort(arr);
        System.out.println("array after sorting : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(i+ " ");
        }
    }
}