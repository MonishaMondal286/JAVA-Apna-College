public class subarray {
    public static void SubArr(int arr[], int n ){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println( );
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,5,6};
        int n = arr.length;
        SubArr(arr, n);
        
    }
}
