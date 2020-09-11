package hackerrank;

import java.util.Scanner;

public class englishfrench {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();
        int counterEnglish = 0;
        int counterFrench = 0;
        for (int i = 0; i < y+1; i++) {

            String b = a.nextLine();
            char[] chars = b.toCharArray();
            for (int z = 0; z < chars.length; z++) {
                if (chars[z] == 'S' || chars[z] == 's') {
                    counterFrench += 1;
                }
                if (chars[z] == 'T' || chars[z] == 't') {
                    counterEnglish += 1;
                }
            }
        }

        if (counterFrench > counterEnglish) {
            System.out.println("French");
        } else if (counterEnglish > counterFrench){
            System.out.println("English");
        } else{
            System.out.println("French");
        }


    }
}
