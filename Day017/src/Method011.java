
import java.util.Scanner;

public class Method011 {

    public static char lower(char a) {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.println("글자 하나 입력 > ");
        ch = scanner.next().charAt(0);

        if (ch >= 'a' && 'z' >= ch) {
            a = (char) (ch - 32);
        } else if (a >= 'A' && 'Z' >= a) {
            a = (char) (ch + 32);
        }
        return a;
    }

    public static void main(String[] args) {
        char a = ' ';
        char res = lower(a);

        System.out.println(res);

    }
}

// Scanner scanner = new Scanner(System.in);
//        System.out.println("문자 한 글자 입력바람 > ");
//        a = scanner.next().charAt(0);
//        if (a >= 'a' && 'z' >= a){
//            a = (char) (a-32);
//        }else if (a >= 'A' && 'Z' >= a){
//            a = (char) (a+32);
//        }
//        return lower(a);