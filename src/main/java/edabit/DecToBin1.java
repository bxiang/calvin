package edabit;

public class DecToBin1 {
    static String someProperty = "abcd";

    public static void main(String[] args) {
        DecToBin1 thisO = new DecToBin1();
        System.out.println("Binary number is:" + binary(47));
        System.out.println(someProperty);
    }


    public static String binary(int dec) {
        String result = "";
        int remainder;
        while (dec > 0) {
            remainder = dec % 2;
            if (remainder == 1) {
                result = remainder + result;
                dec /= 2;
            } else if (remainder == 0) {
                result = remainder + result;
                dec /= 2;
            }
        }

        return result;
    }
}
