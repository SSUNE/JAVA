import java.util.Scanner;

public class DAY012_2 {
    public static void main(String[] args) {

        int num = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 1개 입력하세요(정수) > ");
        num = scanner.nextInt();

        switch (num){
            case 1 : result = "1이다."; break;
            case 2 : result = "2이다."; break;
            case 3 : result = "3이다."; break;
        }
        System.out.println(result);
    }
}
