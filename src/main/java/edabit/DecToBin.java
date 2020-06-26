package edabit;

public class DecToBin {
    public static void main(String[] args) {
        System.out.println("Hexadecimal Number is:" + number(47));
    }

    public static int number(int dec) {

        int x = 1;
        int counter = 0, reversed = 0;
        while (dec > 0) {
            if (dec == 1) {
                counter += (x - 9);
                dec = dec / 2;
            } else if (dec % 2 == 1) {
                counter += x;
                x = x * 10;
                dec = dec / 2;
            } else if (dec > 0) {
                if (dec % 2 == 0) {
                    counter += (x - 1);
                    dec = dec / 2;
                    x = x * 10;

                }
            } else if (dec == 1) {
                counter += (x + 2);
            }
        }
        while (counter != 0) {
            int digit = counter % 10;
            reversed = reversed * 10 + digit;
            counter /= 10;
        }
        return reversed;
    }
}
