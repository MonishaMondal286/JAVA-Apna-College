import java.util.*;
public class gpt2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter : ");
        char letter = sc.next().charAt(0);
        if(letter == 'a'||letter =='e'||letter =='i'||letter =='o'||letter =='u'
        ||letter =='A'||letter =='E'||letter =='I'||letter =='O'||letter =='U'){
            System.out.println("it's a vowel");
        }
        else{
            System.out.print("it's a consonent");
        }
    }
}