package com.dmoj;

import java.util.Scanner;

public class snowCalls {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();

        for (int i = 0; i < y; i++) {

            String last = "";
            String b = a.next();
            char[] chars = b.toCharArray();
            for (int x = 0; x < b.length(); x++) {
                if (chars[x] == '1') {
                    last = last + "1";
                } else if (chars[x] == '2') {
                    last = last + "2";
                } else if (chars[x] == '3') {
                    last = last + "3";
                } else if (chars[x] == '4') {
                    last = last + "4";
                } else if (chars[x] == '5') {
                    last = last + "5";
                } else if (chars[x] == '6') {
                    last = last + "6";
                } else if (chars[x] == '7') {
                    last = last + "7";
                } else if (chars[x] == '8') {
                    last = last + "8";
                } else if (chars[x] == '9') {
                    last = last + "9";
                } else if (chars[x] == '0') {
                    last = last + "0";
                } else if ("ABC".contains("" + chars[x])) {
                    last = last + "2";
                } else if (chars[x] == 'D' || chars[x] == 'E' || chars[x] == 'F') {
                    last = last + "3";

                } else if (chars[x] == 'G' || chars[x] == 'H' || chars[x] == 'I') {
                    last = last + "4";

                } else if (chars[x] == 'J' || chars[x] == 'K' || chars[x] == 'L') {
                    last = last + "5";

                } else if (chars[x] == 'M' || chars[x] == 'N' || chars[x] == 'O') {
                    last = last + "6";

                } else if (chars[x] == 'P' || chars[x] == 'Q' || chars[x] == 'R' || chars[x] == 'S') {
                    last = last + "7";

                } else if (chars[x] == 'T' || chars[x] == 'U' || chars[x] == 'V') {
                    last = last + "8";

                } else if (chars[x] == 'W' || chars[x] == 'X' || chars[x] == 'Y' || chars[x] == 'Z') {
                    last = last + "9";
                } else if (chars[x] == '-') {
                    last = last;
                }

            }

            System.out.println(last.substring(0, 3) + "-" + last.substring(3, 6) + "-" + last.substring(6, 10));
        }
    }
}
