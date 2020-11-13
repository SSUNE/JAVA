import java.util.Scanner;

public class For016 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, result2 = 0;
        char op = ' ';
        String result = "", result3 = "";


        Scanner scanner = new Scanner(System.in);

        for (;;) {

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

            if (op == '+') {
                result = " " + (num1 + num2);
            } else if (op == '-') {
                result = " " + (num1 - num2);
            } else if (op == '*') {
                result = " " + (num1 * num2);
            } else if (op == '/') {
                result = " " + (num1 / (float) num2);
            }

            System.out.println("" + num1 + op + num2 + "=" + result);

            for (;;) {
                System.out.println("다시 시작하시겠습니까?");
                result2 = scanner.nextInt();
                if (result2 == 1) {
                    break;
                } else if (result2 == 2) {
                    break;
                } else {
                    continue;
                }

            }
            if (result2 == 1) {
                continue;
            } else {
                break;
            }
        }// 바깥 for문 끝
    }
}
