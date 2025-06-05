public class reverse_1 {
    public static void main(String args[]){
        int n = 10899;
        while(n>0){
            int last_digit = n%10;
            System.out.print( last_digit);
            n = n/10;
        }
        System.out.println();
    }
}
