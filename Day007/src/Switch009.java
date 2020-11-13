import java.util.Scanner;

public class Switch009 {
    public static void main(String[] args){
        double num1 = 0, num2= 0;
        char op = ' ';
        double result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 한개 입력 > ");      num1 = scanner.nextInt();
        System.out.println("정수 한개 입력 > ");      num2 = scanner.nextInt();
        System.out.println("연산자 한개 입력 > ");     op = scanner.next().charAt(0);

        switch (op) {
            case '+' : result = num1 + num2; break;
            case '-' : result = num1 - num2; break;
            case '*' : result = num1 * num2; break;
            case '/' : result = num1 / num2; break;
        }
        System.out.println("" + num1 + op + num2 + "=" + result);
    }
}
