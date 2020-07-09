package edabit;

public class Tax {
    public static void main(String[] args) {
        System.out.println("Your taxable income is:" + income(67891));
    }

    public static double income(int input) {
        float tax = 0;
        float taxRate = 0;
        for (int i = input; i > 0; i = i - 20000) {
            if (taxRate == 0.3) {
                tax = tax + ((i - 60000) * taxRate);
            } else if ((i - 20000) < 0) {
                tax = tax + (i * taxRate);
                taxRate = taxRate + (1 / 10);
            } else if ((i - 20000) > 0) {
                tax = tax + (20000 * taxRate);
                taxRate = taxRate + 0.1f;
            }
        }
        return tax;
    }
}
