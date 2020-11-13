import java.util.Scanner;

public class Day014_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("j, s, e 중에서 입력하세요.");
        char ch = scanner.next().charAt(0);


        switch (ch) {
            case 'j':
                System.out.println("java");
                break;
            case 's':
                System.out.println("spring");
                break;
            case 'e':
                System.out.println("e-gov");
                break;

        }


    }
}
