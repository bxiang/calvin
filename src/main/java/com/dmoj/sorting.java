package com.dmoj;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int arr[] = new int[a];
        for(int i = 0; i< a; i++){
        arr[i] = Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr);
        for(int i = 0; i< a; i ++){
            System.out.println(arr[i]);
        }
    }
}
