import java.util.Scanner;

public class Method012 {

    public static int inputNum(){
        int num1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자입력 > ");
        num1 = scanner.nextInt();
        return num1;
    }
    public static int inputOper(){
        char op = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자입력 > ");
        op = scanner.next().charAt(0);
        return op;
    }
    public static float calc(int num1, int num2, char op){
        float result = 0f;
        switch (op){
            case '+' : result = num1+num2 ; break;
            case '-' : result = num1-num2; break;
            case '*' : result = num1*num2; break;
            case '/' : result = (float) num1/num2; break;
        }
        return result;
    }

    public static void show(int num1, int num2, char op, float result) {
        if (op == '+' || op == '-' || op == '*') {
            System.out.println("" + num1 + op + num2 + "=" + (int) result);
        } else if (op == '/') {
            System.out.println("" + num1 + op + num2 + "=" + String.format("%.2f", result));
        }
    }

    public static void main(String[] args) {
        //변수
        int num1 = 0, num2 = 0;
        float result = 0.0f;
        char op = ' ';
        //입력
        num1 = inputNum();
        num2 = inputNum();
        op = (char) inputOper();
        //처리
        result = calc(num1, num2, op);
        //출력
        show(num1, num2, op, result);
    }
}

