package com.dmoj;

import java.util.Scanner;

public class aminusb {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();


        for (int i = 0; i < y; i++) {
            int b = a.nextInt();
            int c = a.nextInt();
            System.out.println(b-c);

        }

    }
}
