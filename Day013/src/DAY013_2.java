import java.util.Scanner;

public class DAY013_2 {
    public static void main(String[] args) {

        int a = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("10, 20, 30 중에 입력하세요 > ");
        a = scanner.nextInt();


        switch (a) {
            case 10 : System.out.println("ten"); break;
            case 20 : System.out.println("twenty"); break;
            case 30 : System.out.println("thirty"); break;
        }

    }
}
