public class PrintString{
    public static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String name = "John";

        PrintLetters(name);
    }

    
}