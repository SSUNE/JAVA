import java.util.Scanner;

public class For015 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0;
        char op = ' ';
        String result = "";
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.print("1. 정수 한개 입력 > ");
            num1 = scanner.nextInt();
            if (num1 >= 0 && num1 <= 100) {
                break; //잘썼으면 빠져나오
            }
        }

        for (;;) {
            System.out.print("2. 정수 한개 입력 > ");
            num2 = scanner.nextInt();
            if (num2 >= 0 && num2 <= 100) {
                break;
            }
        }

        for (;;) {
            System.out.print("3. 연산자 한개 입력 > ");
            op = scanner.next().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                break;
            }
        }

            switch (op) {
                case '+' : result = " " + (num1 + num2); break;
                case '-' : result = " " + (num1 - num2); break;
                case '*' : result = " " + (num1 * num2); break;
                case '/' : result = " " + (num1 / (float)num2); break;
            }

            System.out.println("" + num1 + op + num2 + "=" + result);

        }

    }

