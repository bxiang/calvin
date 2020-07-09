package edabit;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigit("aa1bc2d3"));
        System.out.println(sumDigit1("1a2a3a4"));
    }

    public static String sumDigit(String input) {
        int counter = 0;

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {

            for (int x = 48; x < 58; x++) {
                if (array[i] == x) {
                    counter = counter + (x - 48);
                }
            }
        }
        return "" + counter;

    }

    public static String sumDigit1(String input) {
        int counter = 0;

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                int x = Integer.parseInt("" + array[i]);
                counter = counter + x;
            }
        }
        return "" + counter;

    }
}


