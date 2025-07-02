// prefix method 

public class MaxSubArr {
    public static void prefixsum(int arr[], int n){
        int currsum =  0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currsum = (i==0)? prefix[j]:prefix[j]-prefix[i-1];
            
                if(maxsum<currsum){
                maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int n = arr.length;
        prefixsum(arr, n);
    }
}
