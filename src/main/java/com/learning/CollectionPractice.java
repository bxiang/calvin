package com.learning;

import java.util.ArrayList;

public class CollectionPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[][][] arr = new String[5][2][3];
        for (int z = 0; z < 3; z++) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 5; i++) {
                    arr[i][j][z] = "" + i + j + z;
                }
            }
        }
        for (int z = 0; z < 3; z++) {
            for (int j = 0; j < 2; j++) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(arr[i][j][z] + " ");
                }
                System.out.println();
            }
            System.out.println("--");
        }
    }
}

