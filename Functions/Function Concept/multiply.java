public class multiply {
    public static int product(int a, int b){
        int multi = a*b;
        return multi;
    }

    public static void main(String args[]){
        int a = 6;
        int b = 7;
        int prod = product(a,b);
        System.out.println(prod);
        prod = product(8,7);
        System.out.println(prod);
    }
}
