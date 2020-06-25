package edabit;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum_3(5, '+', 10));
    }

    public static int sum_1(int a, int b) {
        return a + b;
    }

    public static long sum_2(int a, char b, int c) {
        long answer = 0;
        if (b == '/') {
            answer = a / c;
        } else if (b == '*') {
            answer = a * c;
        } else if (b == '+') {
            answer = a + c;
        } else if (b == '-') {
            answer = a - c;
        }
        return answer;
    }

    public static long sum_3(int a, char b, int c) {
        long answer = 0;
        switch (b) {
            case '/': {
                answer = a / c;
                break;
            }
            case '*': {
                answer = a * c;
                break;
            }
            case '+': {
                answer = a + c;
                break;
            }
            case '-': {
                answer = a - c;
                break;
            }
        }
        return answer;
    }
}
