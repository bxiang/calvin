package hackerrank;

import java.util.Scanner;

public class cellsell {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        if(b <= 100){
            b = 100;
        }
        double answera = ((b - 100) * .25) + (c * .15) + (d * .20);
        if (b <= 250) {
            b = 250;
        }
        double answerb = ((b - 250) * .45) + (c * .35) + (d * .25);
        double rounded = Math.round(answerb*100)/100.0;
        double roundeda = Math.round(answera*100)/100.0;
        System.out.println("Plan A costs " + roundeda);
        System.out.println("Plan B costs " + rounded);
        if (roundeda > rounded) {
            System.out.println("Plan B is cheapest.");
        } else if (rounded > roundeda) {
            System.out.println("Plan A is cheapest.");
        } else if (roundeda == rounded){
            System.out.println("Plan A and B are the same price.");
        }
    }
}