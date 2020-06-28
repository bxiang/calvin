package edabit;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String input) {
        int length = input.length();
        char[] reversing = new char[length];
        String result = "";
        input.getChars(0, length, reversing, 0);
        for (int i = 0; i < length; i++) {
            result = reversing[i] + result;
        }
        return result;
    }
}
