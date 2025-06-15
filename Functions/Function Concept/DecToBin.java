public class DecToBin {
    public static void DecNum(int n){
        int pow = 0;
        int bin = 0;
         int result = n;
        while(n>0){
           
            int rem = n%2;
            bin = bin + (int)(rem*Math.pow(10,pow));
            pow++;
            n = n/2;
            
        }
        System.out.print("Binary number of "+ result +" is "+ bin);
    }

    public static void main(String args[]){
        DecNum(9);
    }
}
