//Remove All Whitespaces from a String
public class ex6 {
    public static void main(String args[]){
        String str = "My package is 12LPA";
        String result = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                result += str.charAt(i);
            }
        }
        System.out.print(result);
    }
}
