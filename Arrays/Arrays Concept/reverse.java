public class reverse {
    public static void RevArr(int num[]){
        int first = 0, last = num.length-1;

        while(first<last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int num[] = {3,4,5,6,7};

        RevArr(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println( );
    }
    
}
