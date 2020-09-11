package hackerrank;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int y = a.nextInt();
        int b = 0;
        for(int i = 0; i<y; i++){

            int x = a.nextInt();
            b = b + x;

        }
        System.out.println(b);
    }
}
