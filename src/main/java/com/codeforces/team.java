package com.codeforces;

import java.util.Scanner;


public class team {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();
        int counter = 0;
        int counter1 = 0;

        for (int i = 0; i < y; i++) {

                int b = a.nextInt();
                int c = a.nextInt();
                int d = a.nextInt();
                counter = b + c + d;
                if (counter >= 2) {
                    counter1++;
                }





        }
        System.out.println(counter1);
    }


}
