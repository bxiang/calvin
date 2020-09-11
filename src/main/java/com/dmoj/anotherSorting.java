package com.dmoj;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;

public class anotherSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        Integer[] ar = new Integer[a];
        String[] inputs = new String[a];
        inputs = br.readLine().split(" ");
        for (int i = 0; i < a; i++) {
            ar[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(ar,new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1%10==o2%10){
                    if(o1>o2)return -1;
                    else if(o1<o2)return 1;
                    return 0;
                }
                if(o1%10<o2%10)return -1;
                return 1;
            }
        });
        for(int i = 0; i<a; i++) {
            System.out.print(ar[i] + " ");
        }
        }
}