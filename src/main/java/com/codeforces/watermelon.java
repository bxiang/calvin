package com.codeforces;
import java.util.Scanner;



public class watermelon {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();
        if(y%2==0 && y != 2){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
    }
}
