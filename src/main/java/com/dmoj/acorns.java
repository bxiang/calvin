package com.dmoj;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class acorns {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] ar = new int[a];
        int cnt = 0;
        String[] inputs = new String[a];
        inputs = br.readLine().split(" ");
        for(int i = 0; i < a; i++){

            ar[i] = Integer.parseInt(inputs[i]);

        }
        Arrays.sort(ar);
        int test = 1;
        int temp = 0;
        for(int j = a-1; j>=0; j--){
            cnt += ar[j];
            for(int b = j-1; b>=0;b--) {

                if (test == 1) {
                    temp = ar[b + 1];
                    test--;
                }
                int temp1 = ar[b];
                if (ar[b] < temp) {
                    temp = temp1;
                    ar[b] = 0;
                }
            }
ar[j] = 0;
test++;
        }


        System.out.println(cnt);
    }
}
/*
6
2 4 6 1 2 3*/
