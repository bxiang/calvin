package com.dmoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class cheese {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[2];
        inputs = br.readLine().split(" ");
        int cheeseAmount = Integer.parseInt(inputs[0]);
        int discounts = Integer.parseInt(inputs[1]);
        long total = 0;
        int[] discountPrices = new int[cheeseAmount+1];
        String[] inputs2 = new String[2];
        for (int i = 0; i < cheeseAmount; i++) {
            inputs2 = br.readLine().split(" ");
            int b = Integer.parseInt(inputs2[0]);
            int c = Integer.parseInt(inputs2[1]);
            discountPrices[i] = b-c;
            total+=b;
        }
        Arrays.sort(discountPrices);
        for(int i=cheeseAmount, counter = 1; counter <=discounts; counter++, i--){
            total -= discountPrices[i];
        }




        System.out.println(total);
    }
}
