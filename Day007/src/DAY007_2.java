import java.util.Scanner;

public class DAY007_2 {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 한개 입력받기>");

        num = scanner.nextInt();

        if (num > 0) {
            System.out.println("양수");
        } else if (num < 0) {
            System.out.println("음수");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println("기타");
        }

    }
}
