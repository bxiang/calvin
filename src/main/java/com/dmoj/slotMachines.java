package com.dmoj;

import java.util.Scanner;

public class slotMachines {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int counter = 0;
        int y = a.nextInt();
        int quarters = y;
        int slot1 = a.nextInt();
        int slot2 = a.nextInt();
        int slot3 = a.nextInt();
        int t = 3;

        while (quarters != 0) {
            if (t%3==0) {
                slot1++;
                if (slot1 == 35) {
                    quarters += 30;
                    slot1 = 0;
                }
            }
            if (t%3==1) {
                slot2++;
                if (slot2 == 100) {
                    quarters += 60;
                    slot2 = 0;
                }
            }
            if (t%3==2) {
                slot3++;

                if (slot3 == 10) {
                    quarters += 9;
                    slot3 = 0;
                }
            }
            quarters -= 1;
            t++;
            counter++;
        }
        System.out.println("Martha plays " + counter + " times before going broke.");
    }
}
