public class reverse_2 {
    public static void main(String args[]){
        int rev = 0;
        int n = 12345;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        }
        System.out.print(rev);
    }
}
