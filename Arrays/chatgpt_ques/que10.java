// //Count All Pairs with Given Sum
// //Count the number of unique pairs that sum to a target value.

public class que10 {
    public static int PrintSumPairs(int arr[], int sum){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               
                if((arr[i]+arr[j]) == sum){
                   System.out.print(arr[i]+","+arr[j]);
                   count++;
                }
            }
           
        }
         return count;
        
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int sum = 4;
        int result = PrintSumPairs(arr, sum);
        System.out.print(result);

        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}


// public class que10 {
//     public static int PrintSumPairs(int arr[], int sum){
//         int count = 0;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i + 1; j < arr.length; j++){
//                 if((arr[i] + arr[j]) == sum){
//                     System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5, 6, 7};
//         int sum = 4;
//         int totalPairs = PrintSumPairs(arr, sum);
        
//         System.out.println("Total unique pairs with sum " + sum + ": " + totalPairs);

//         System.out.print("Array elements: ");
//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
// }
