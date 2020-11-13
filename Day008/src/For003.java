import java.util.Scanner;

public class For003 {
    public static void main(String[] args) {
        // 구구단 프로그램
        // 원하는 단을 입력해주세요 > 입력

        int dan = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 단을 입력해주세요 > ");
        dan = scanner.nextInt();

        for (int i=1; i<=9; i++ ) {
            System.out.println(dan + " * " + i + " = " + (dan * i) );
        }
    }
}
