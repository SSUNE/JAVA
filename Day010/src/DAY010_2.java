import java.util.Scanner;

public class DAY010_2 {
    public static void main(String[] args) {

        int a = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("1,2,3 중에 한 개의 숫자를 입력하시오 >> ");
        a = scanner.nextInt();

        switch (a){
            case 1 : result = "1이다."; break;
            case 2 : result = "2이다."; break;
            case 3 : result = "3이다."; break;
            default: result = "유효하지 않은 숫자입니다."; break;
        }

        System.out.println(result);
    }
}
