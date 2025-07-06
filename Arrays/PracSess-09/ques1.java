public class ques1 {
    public static boolean identify(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
                   
            }
        }
         return false;
    }

    public static void main(String args[]){
        int arr[] = {2,3,6,5};
        
        System.out.println(identify(arr));
    }
}
