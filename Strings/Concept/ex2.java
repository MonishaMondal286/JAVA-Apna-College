//Check if a String is a Palindrome

public class ex2 {
    public static void main(String args[]){
        String str = "mom";
        String palin = "";

        for(int i=str.length()-1;i>=0;i--){
            palin += str.charAt(i) ;

        }
        System.out.println(palin);

        if(str.equals(palin)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
