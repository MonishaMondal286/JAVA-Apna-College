//Print All Pairs in Array
//For an array of size n, print all nC2 pairs.

public class que9 {
    public static void PrintPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3};
        PrintPairs( arr);
    }

}
