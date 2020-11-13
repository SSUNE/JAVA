import java.util.Scanner;

public class Day014_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("j, s, e 중에서 입력하세요.");
        char ch = scanner.next().charAt(0);

        if (ch == 'j') {
            System.out.println("java");
        } else if (ch == 's') {
            System.out.println("spring");
        } else if (ch == 'e') {
            System.out.println("e-gov");
        }

    }
}
