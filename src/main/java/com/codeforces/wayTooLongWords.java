package com.codeforces;
import java.util.Scanner;


public class wayTooLongWords {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();

        for(int i = 0; i<y; i++){
            String answer = null;
            String b = a.next();
            if(b.length() > 10){
                answer = b.substring(0, 1) + (b.length()-2) + b.substring((b.length()-1),b.length() );
                System.out.println(answer);
            }
            else{
                System.out.println(b);
            }
        }

    }
}
