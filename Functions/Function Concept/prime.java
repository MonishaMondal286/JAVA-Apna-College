public class prime {
    public static boolean primenum(int n){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void main(String args[]){
        System.out.println(primenum(2));
    }
}
