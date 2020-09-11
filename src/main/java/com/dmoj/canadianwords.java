package com.dmoj;

import java.util.Scanner;

public class canadianwords {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String y = "";

        while (!y.equals("quit!")) {
            y = a.next();
            if (y.length() < 4) {
                System.out.println(y);
            } else if (y.substring(y.length() - 2).equals("or") && y.charAt(y.length() - 3) != 'a'
                    && y.charAt(y.length() - 3) != 'e'
                    && y.charAt(y.length() - 3) != 'i'
                    && y.charAt(y.length() - 3) != 'o'
                    && y.charAt(y.length() - 3) != 'u'
                    && y.charAt(y.length() - 3) != 'y'
            ) {
                y = y.substring(0, y.length() - 2) + "our";
                System.out.println(y);

            } else if (y.equals("quit!"))
                break;
            else {
                System.out.println(y);
            }
        }
    }
}

