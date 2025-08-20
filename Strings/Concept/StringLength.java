public class StringLength {
    public static void findLength(String str) {


        // TODO: Find and print the length of the input string
        // Expected output for "Hello" should be: Length is 5
        int result = str.length();
        System.out.println("Length is " + result);
    
    }

    public static void main(String args[]) {
        String input = "Hello World";
        findLength(input);
    }
}
