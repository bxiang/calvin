package hackerrank;
import java.util.Arrays;
import java.util.Scanner;

public class goldilock {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b[]= new int[3];
        b[0] = a.nextInt();
        b[1] = a.nextInt();
        b[2] = a.nextInt();

        Arrays.sort(b);

        System.out.println(b[1]);
    }
}
