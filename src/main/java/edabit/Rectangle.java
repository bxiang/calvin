package edabit;

public class Rectangle {
    public static void main(String[] args){
        System.out.println(perimeter(5, 10));
    }
    public static int perimeter(int length, int width) {return 2*(length+width);}
}
