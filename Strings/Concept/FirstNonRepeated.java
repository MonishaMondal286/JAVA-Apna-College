public class FirstNonRepeated {
    public static char findFirstNonRepeated(String str) {
        // TODO: Return the first character that doesn't repeat in the string
        // Expected output for "hello" should be: 'h'
        // Expected output for "aabbcc" should be: '\0' (null character)
        return '\0';  // Replace this with your code
    }

    public static void main(String args[]) {
        String input = "hello world";
        char result = findFirstNonRepeated(input);
        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}
