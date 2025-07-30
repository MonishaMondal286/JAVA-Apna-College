//Maximum Subarray Sum (Brute Force)
//Find the subarray with the maximum sum (use 3 nested loops).

public class que12 {
    public static int MaxSubArr(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    currsum += arr[k];
                    if(currsum>maxsum){
                        currsum = maxsum;
                    }

                }
                
            }
            
        }

        return currsum;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int result = MaxSubArr( arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(result);
        }

    }
}
