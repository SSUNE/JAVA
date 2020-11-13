import java.util.Scanner;

public class DAY011_1 {
    public static void main(String[] args) {
        char a = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("a,b,c중에 한개의 문자를 입력하시오 > ");
        a = scanner.next().charAt(0);

        if (a == 'a' || a == 'A') {
            System.out.println("apple이다.");
        } else if (a == 'b' || a == 'B') {
            System.out.println("banana이다.");
        } else if (a == 'c' || a == 'C') {
            System.out.println("coconut이다.");
        }


        System.out.println(1%3);
    }
}
