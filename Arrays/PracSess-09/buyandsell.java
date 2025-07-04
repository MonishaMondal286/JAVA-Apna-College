public class buyandsell {
    public static int BuySell(int price[]){
        int Buystock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<price.length;i++){
            if(Buystock<price[i]){
            int profit = price[i] - Buystock;
            maxProfit = Math.max(profit, maxProfit);
            }
            else{
                Buystock = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(BuySell(price));
    }
}
