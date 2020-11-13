import java.util.Scanner;

public class DAY007_1 {
    public static void main(String[] args) {

        int avg=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("평균을 입력하시오>");
        avg = scanner.nextInt();

        if (avg >= 60) {System.out.println("합격입니다.");}
        else {System.out.println("불합격입니다");}
    }
}
