public class linear2 {
    public static int linear_string(String str[], String fin){
        for(int i=1;i<str.length;i++){
            if(str[i] == fin){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String str[] = {"reading", "coding", "writing", "sleeping"};
        String fin = "coding";

        int index = linear_string(str, fin);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("index of fin : "+fin);
        }
    }
}
