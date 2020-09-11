package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class permutation {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++){
            int cases = Integer.parseInt(br.readLine());
            String[] inputs = new String[cases];
            inputs = br.readLine().split(" ");
            int[] p = new int[cases];
            for(int j = 0; j <= cases-1; j++){
                p[j] = Integer.parseInt(inputs[j]);
            }
            for(int b = p.length-1; b>=0; b--) {
                System.out.print(p[b] + " ");
            }
        }

    }
}
