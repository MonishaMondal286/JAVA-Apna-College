public class BinToDec {
    public static void BinNum(int n){
        int myNum = n;
        int pow = 0;
        int DecNum = 0;
        while(n>0){
            int LastDigit = n%10;
            DecNum = DecNum + (int)(LastDigit * Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+ myNum +" is "+DecNum);
    }

    public static void main(String args[]){
        BinNum(10101);
    }
}
