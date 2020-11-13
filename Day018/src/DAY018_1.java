import java.util.Scanner;

public class DAY018_1 {
    public static void main(String[] args) {
        char ch = ' ';

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ for문 ]");
        for (; ; ) {
            System.out.println("+,-,*,/중에서 입력하세요>");
            ch = scanner.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                break;
            }
        }


        System.out.println("[ while ]");
        while (true) {
            System.out.println("+,-,*,/중에서 입력하세요>");
            ch = scanner.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                break;
            }
        }

        System.out.println("[ do-while ]");
        do {
            System.out.println("+,-,*,/중에서 입력하세요>");
            ch = scanner.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                break;
            }
        } while (true);

        System.out.println("[ do-while-2 ]");
        do {
            System.out.println("+,-,*,/중에서 입력하세요>");
            ch = scanner.next().charAt(0);
        } while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/'));

        System.out.println("[ do-while-3 ]");
        do {
            System.out.println("+,-,*,/중에서 입력하세요>");
            ch = scanner.next().charAt(0);
        } while (ch != '+' && ch != '-' && ch != '*' && ch != '/');

    }
}
