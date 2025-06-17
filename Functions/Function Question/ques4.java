public class ques4 {
    public static int sum(int a){
        int total = 0;
        while(a>0){
            int rem = a%10;
            total += rem;
            a = a/10;
            
        }
        return total;
    }

    public static void main(String args[]){
        System.out.println("sum of the digits are : "+sum(1234)); 
    }


}
