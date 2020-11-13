import java.util.Scanner;

public class IF013_1 {
    public static void main(String[] args){
        // 변수
        int num1=0, num2=0;
        float result=0f;
        char op=' ';
        Scanner scanner = new Scanner(System.in);

        // 입력
        System.out.println("1. 정수를 하나 입력해줏요.");     num1 = scanner.nextInt();
        System.out.println("2. 정수를 하나 입력해줏요.");     num2 = scanner.nextInt();
        System.out.println("3. 연산자 입력해줏요.");     op = scanner.next().charAt(0);

        // 처리
        if (op == '+' ) {result = num1 + num2; }
        else if (op == '-' ) {result = num1 - num2; }
        else if (op == '*' ) {result = num1 * num2; }
        else if (op == '/' ) {result = num1 / num2; }

        // 출력

        System.out.println("" + num1 + op + num2 + "=" + result);

        // ver-1) if        - 만약에 /가 아니라면 정수로 출력, /라면 실수로 출력
        if (op != '/'){System.out.println("" + num1 + op + num2 + "=" + (int)result);}
        else {System.out.println("" + num1 + op + num2 + "=" + result);}


        if (op == '+' || op == '-' || op == '*') {System.out.println("" + num1 + op + num2 + "=" + (int)result);}
        else {System.out.println("" + num1 + op + num2 + "=" + result);}

        // ver-2) 삼항연산자   - 만약에 /가 아니라면 정수로 출력, / 라면 실수록 출력

        System.out.println("" + num1 + op + num2 + "=" + ((op == '/')? result : (int)result)) ;



    }
}
