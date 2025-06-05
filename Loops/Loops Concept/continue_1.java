public class continue_1 {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}

// the output 5 will be missing 
