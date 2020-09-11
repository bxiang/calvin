package com.codeforces;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class yetAnotherTwoIntegers {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            String[] inputs = new String[2];
            inputs = br.readLine().split(" ");
            int b = Integer.parseInt(inputs[0]);
            int c = Integer.parseInt(inputs[1]);
            if(b==c){
                System.out.println(0);
            }
            else if( b < c){
                int counter = 0;
                int test = c-b;
                for(int x = 10; x>=0;){
                    if(x ==0){
                        break;
                    }
                    if(test<=10){
                        test = test - test;
                        counter++;
                        break;
                    }

                    if(test/10 > 0){
                        int temp = test/10;
                        counter += temp;
                        test = test - temp*10;
                        if(test==0){
                            break;
                        }
                    }
                    if(test-x>=0){
                        test = test -x;
                        counter++;
                    }
                    else if(test-x<0){
                        x--;
                    }
                }
                System.out.println(counter);
            }
            else if(b > c){
                int counter = 0;
                int test = b-c;
                for(int x = 10; x>=0;){
                    if(x ==0 || test ==0){
                        break;
                    }
                    if(test<=10) {
                        test = test - test;
                        counter++;
                        break;
                    }

                    if(test/10 > 0) {
                        int temp = test / 10;
                        counter += temp;
                        test = test - temp * 10;
                        if(test==0){
                            break;
                        }
                    }
                    if(test-x>=0){
                        test = test -x;
                        counter++;
                    }
                    else if(test-x<0){
                        x--;
                    }
                }
                System.out.println(counter);
            }

        }

    }
}
