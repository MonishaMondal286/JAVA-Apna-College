

public class linear3{
    public static int lin_Sea(int num[], int n){
        for(int i=1;i<num.length-1;i++){
            if(num[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num[] = {18, 12, -7, 3, 14, 28};
        int result = 3;
        int index = lin_Sea(num , result);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("index of the number is : "+ index);
        }
        
    }
}