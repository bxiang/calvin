package com.dmoj;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

public class nextPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        boolean isPrime = false;
        if(a ==1){
            System.out.println(2);
            isPrime = true;
        }
        if(a==0){
            System.out.println(2);
            isPrime = true;
        }
        if (a == 2) {
            System.out.println(a + 1);
            isPrime = true;
        } else if (a % 2 == 0) {
            a++;
        }
        BigInteger big = new BigInteger("1098127350198325701392587");
        boolean asd = big.isProbablePrime(1);
        while (isPrime == false) {
            for (int b = a; isPrime != true; b += 2) {

                    if(isPrimeBruteForce(b)) {
                        System.out.println(b);
                        isPrime = true;


                    }
            }
            }

        }

    public static boolean isPrimeBruteForce(int number) {
        for (int i = 3; (i*i)< number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
