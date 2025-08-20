public class CheckRotation {
    public static boolean isRotation(String str1, String str2) {
        // TODO: Check if str2 is a rotation of str1
        // A rotation is when you take a string and move some characters from the end to the start
        // Expected output for "HelloWorld" and "WorldHello" should be: true
        return false;  // Replace this with your code
    }

    public static void main(String args[]) {
        String input1 = "HelloWorld";
        String input2 = "WorldHello";
        System.out.println("Is rotation? " + isRotation(input1, input2));
    }
}
