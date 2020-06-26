package edabit;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(5, 2));
        int x = 1;
        x += 3;  // x = x + 1;
        x++;
    }

    public static int triangle(int height, int base) {
        return (height * base) / 2;
    }
}
