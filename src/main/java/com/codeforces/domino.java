package com.codeforces;
import javafx.scene.SubScene;

import java.util.Scanner;

public class domino {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt(), c = a.nextInt();
        System.out.println(((b*c)-((b*c)%2))/2);
    }
}
