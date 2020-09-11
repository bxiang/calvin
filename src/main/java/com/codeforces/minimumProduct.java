package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class minimumProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i<a; i++){
            String[] inputs = new String[5];
            inputs = br.readLine().split(" ");
            int b = Integer.parseInt(inputs[0]);
            int c = Integer.parseInt(inputs[1]);
            int d = Integer.parseInt(inputs[2]);
            int e = Integer.parseInt(inputs[3]);
            int f = Integer.parseInt(inputs[4]);
            for(int x = f; x>=0;){
                if(b>c && b<=d){

                }

            }
            System.out.println(b *c);
        }

    }
}
