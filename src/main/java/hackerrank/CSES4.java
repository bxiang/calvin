package hackerrank;

import java.util.Scanner;

public class CSES4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner n = new Scanner(System.in);
        long y = n.nextInt();
        boolean[] a = new boolean[(int) (y + 1)];
        for(int i = 0; i < y-1; i++){
            long b = n.nextLong();
            a[(int)b] = true;
        }
    }
}

