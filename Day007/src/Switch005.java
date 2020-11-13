import java.util.Scanner;

public class Switch005 {
    public static void main(String[] args){

        char s = ' ';
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자 1개 입력하시오(a, b, c) > ");
        s = scanner.next().charAt(0);

        switch (s) {
            case 'a' :  case 'A' :
                result="apple"; break;
            case 'b' :  case 'B' :
                result="banana"; break;
            case 'c' :  case 'C' :
                result="coocnut"; break;

        }

        System.out.println(result);

    }
}
