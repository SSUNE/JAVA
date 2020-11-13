import java.util.Scanner;

public class DAY010_1 {
    public static void main(String[] args) {

        int a = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1,2,3 중에 한 개의 숫자를 입력하시오 >> ");
        a = scanner.nextInt();

        if (a == 1 || a == 2 || a == 3){
            System.out.println(a + "이다");
        }else {
            System.out.println("1,2,3이 아니라면 유효하지 않은 숫자입니다.");
        }
    }
}
