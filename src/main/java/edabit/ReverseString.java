package edabit;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        String result = "";
//        input.getChars(0, length, reversing, 0);

        for (int i = 0; i < charArray.length; i++) {
            result = charArray[i] + result;
        }
        return result;
    }
}
