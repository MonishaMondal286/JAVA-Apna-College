public class exe4 {
    public static void main(String args[]){
        String str = "i am a java developer";
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
