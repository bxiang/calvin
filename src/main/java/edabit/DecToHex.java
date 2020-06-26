package edabit;

public class DecToHex {
    public static void main(String[] args) {
        System.out.println("Hexadecimal Number is:"+ hex(10000));
    }
    public static String hex(int dec){
        char[] hex1 = {'0','1','2','3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String result ="";
        int remainder;
        while(dec >0){
            remainder = dec%16;
            result = hex1[remainder] + result;
            dec = dec/16;
        }
        return result;
    }
}
