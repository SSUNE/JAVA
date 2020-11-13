import java.util.Scanner;

public class Switch003 {
    public static void main(String[] args){

        char num = ' ';
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자 1개 입력하시오(a, b, c) > ");
        num = scanner.next().charAt(0);

        switch (num) {
            case 'a' : result="apple"; break;
            case 'b' : result="banana"; break;
            case 'c' : result="coocnut"; break;
            default: result = "a,b,c가 아닙니다."; break;

        }

        System.out.println(result);

    }
}
