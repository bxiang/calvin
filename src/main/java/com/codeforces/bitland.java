package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class bitland {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i = 0; i<a; i++){

            String input = br.readLine();
            if(input.contains("++")){
                x++;
            }
            else if(input.contains("--")){
                x--;

            }
        }

        System.out.println(x);
    }


}
