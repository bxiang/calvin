package hackerrank;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.util.Scanner;
import java.util.HashSet;

public class DistinctNumbers {
    public static void main(String[] args) {
        System.out.println();
        Scanner n = new Scanner(System.in);
        int y = n.nextInt();
        HashSet<Integer> b = new HashSet<Integer>();
        for(int i = 0; i < y;i++) {
            int x = n.nextInt();
            b.add(x);
        }
        System.out.println(b.size());
    }
}
