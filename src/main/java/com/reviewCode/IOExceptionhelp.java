package com.reviewCode;

import  java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IOExceptionhelp {
    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y;
        try {
            y = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("IOException");
            y = -1;
        } catch (RuntimeException e) {
            System.out.println("something wrong");
            y = 0;
        }
        System.out.println(y);
    }
}
