package edabit;

import java.nio.DoubleBuffer;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(convertPhone("computer"));
    }

    public static String convertPhone(String input) {
        char[] letter = input.toCharArray();
        String counter = "";
        for (int i = 0; i < letter.length; i++) {
            if ("abc".contains("" + letter[i])) {
                counter = counter + "2";

            } else if (letter[i] == 'd' || letter[i] == 'e' || letter[i] == 'f') {
                counter = counter + "3";

            } else if (letter[i] == 'g' || letter[i] == 'h' || letter[i] == 'i') {
                counter = counter + "4";

            } else if (letter[i] == 'j' || letter[i] == 'k' || letter[i] == 'l') {
                counter = counter + "5";

            } else if (letter[i] == 'm' || letter[i] == 'n' || letter[i] == 'o') {
                counter = counter + "6";

            } else if (letter[i] == 'p' || letter[i] == 'q' || letter[i] == 'r' || letter[i] == 's') {
                counter = counter + "7";

            } else if (letter[i] == 't' || letter[i] == 'u' || letter[i] == 'v') {
                counter = counter + "8";

            } else if (letter[i] == 'w' || letter[i] == 'x' || letter[i] == 'y' || letter[i] == 'z') {
                counter = counter + "9";

            }
        }
        return counter;
    }
//    public static String convertPhone1(String input){
//        char[] letter = input.toCharArray();
//        String counter = "";
//        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        for(int i = 0;i<input.length(); i++){
//            switch (letter[i]){
//                case chars[0] .. chars[2]: {
//
//                }
//            }
//        }
//        return counter;
//    }
}
