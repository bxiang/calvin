package edabit;

public class Farm {
    public static void main(String[] args) {
        System.out.println(legs((short)5, (short)2, (short)8));
    }

    public static long legs(short chicken, short cows, short pigs) {
        return chicken * 2 + cows * 4 + pigs * 4;
    }
}
