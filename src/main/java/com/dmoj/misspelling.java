package com.dmoj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class misspelling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int counter = 1;
        for (int i = 0; i < a; i++) {
            String in =br.readLine();
            int spaceind=in.indexOf(' ');
            int b=Integer.parseInt(in.substring(0,spaceind));
            String c=in.substring(spaceind+1);
            System.out.println(counter + " " + c.substring(0, Math.max(0,b - 1)) + c.substring(b));
            counter++;
        }

    }
}
