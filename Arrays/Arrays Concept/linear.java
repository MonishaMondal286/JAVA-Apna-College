public class linear {
    public static int linear_search(int num[], int a){

        for(int i=1;i<num.length;i++){
            if(num[i] == a){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num[] = {3,6,7,8,2,45,56};
        int a = 6;

        int index= linear_search(num , a);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("index of the key is : "+index);
        }
    }
}
