package com.dmoj;


import java.util.Scanner;

public class loveLetter {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String g = a.next();
        String t = a.next();
        int y = Integer.parseInt(g);
        int b = Integer.parseInt(t);
        a.nextLine();
        String cipher = a.nextLine();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] input = cipher.toCharArray();
        String cipheredCode = "";
        for (int i = 0; i < y; i++) {
            for (int z = 0; z < 26; z++) {
                if (input[i] == alphabet[z]) {
                    cipheredCode = cipheredCode + alphabet[(z + b) % 26];
                }
                if (input[i] == ' ') {
                    cipheredCode = cipheredCode + ' ';
                    break;
                }
            }
        }
        System.out.println(cipheredCode);
    }
}