public class fact {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n = 7;
        int result = factorial(n);
        System.out.println(result);
    }


}
