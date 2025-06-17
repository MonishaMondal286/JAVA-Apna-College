public class ques3 {
        

    public static void isPalin(int n){
        int original = n;
        int palindro = 0;

        while(n>0){
        int rem = n%10;
        palindro =palindro*10+rem;
        n=  n/10;
        }
       
        if(palindro==original){
          System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
     } 
    public static void main(String args[]){
        isPalin(121);
    }
}
