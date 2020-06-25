package edabit;

public class ConvertTime {
    public static void main(String[] args) {
        ConvertTime thisInstance = new ConvertTime();
        int seconds = thisInstance.convert(10);
        System.out.println(seconds);
    }

    public int convert(int minutes) {
        return minutes * 60;
    }
}
