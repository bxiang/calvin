package edabit;

public class Capitilize {
    public static void main(String[] args) {

        String input1 ="the quick brown fox jumps over the lazy dog";
        String result1 = capitilize(input1);
        System.out.println(result1);
        System.out.println(input1.length());
        System.out.println(result1.length());
//        if(input1.length() == result1.length()){
//            System.out.println("True");
//        }
        System.out.println(capitilize1("calvin xiang"));
    }

    public static String capitilize(String sentence) {
        String[] initial = sentence.split(" ");
        int returnedLength = initial.length;
        String[] returned = new String[returnedLength];
        for (int i = 0; i < returnedLength; i++) {
            String y = initial[i].substring(0, 1).toUpperCase() + initial[i].substring(1);
            returned[i] = y + " ";
        }
        String final1 = "";
        for (int i = 0; i < returnedLength; i++) {
            final1 = final1 + returned[i];
        }
        return final1.trim();
    }
    public static String capitilize1(String sentence) {
        String[] initial = sentence.split(" ");
        int returnedLength = initial.length;
        String final1 = "";
        for (int i = 0; i < returnedLength; i++) {
            String y = initial[i].substring(0, 1).toUpperCase() + initial[i].substring(1);
            final1 = final1 + y + " ";
        }
        final1.trim();
        return final1.trim();
    }

}