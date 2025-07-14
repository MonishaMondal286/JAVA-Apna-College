public class selection {
    public static void SelectSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mini = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mini]<arr[j]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SelectSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
