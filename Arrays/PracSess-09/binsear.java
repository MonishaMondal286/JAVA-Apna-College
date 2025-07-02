public class binsear{
    public static int BinSea(int num[], int n){
        int start = 0, end = num.length-1;

        while(start<=end){
            int mid = (start+end)/2;
        if(num[mid]==n){
            return mid;
        }
        if(num[mid]<n){
            start = mid+1;
        }
        else{
            end = mid-1;
        }

        }
        return -1;
    }

    public static void main(String args[]){
        int num[] = {2,5,8,9,10};
        int n = 9;
        int result = BinSea(num, n);
        
        if(result!=-1){
            System.out.println(result);
        }
        else{
            System.out.println("not found");
        }
    }
}