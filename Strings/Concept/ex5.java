//Check if Two Strings are Anagrams
import java.util.*;
public class ex5 {
    public static void main(String args[]){
         String str1 = "loop";
         String str2 = "pool";

         char[] arr1 = str1.toCharArray();
         char[] arr2 = str2.toCharArray();

         Arrays.sort(arr1);
         Arrays.sort(arr2);

         if(Arrays.equals(arr1, arr2)){
            System.out.println("it's anagram");
         }
         else{
            System.out.println("not a anagram");
         }
    }
}
