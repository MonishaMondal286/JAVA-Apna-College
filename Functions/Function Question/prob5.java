// 9. **Write a method that swaps two numbers using a temporary variable.**
public class prob5 {
    public static int swap(int a, int b){
        
        int temp = a;
        a = b;
        b = temp;
        return a, b;
        


    }

    public static void main(String args[]){
        System.out.println(swap(4,5));
    }
}
