import java.util.Scanner;

public class DAY012_1 {
    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 1개 입력하세요(정수) > ");
        num = scanner.nextInt();

        if (num==1){
            System.out.println("1이다");
        }else if (num==2){
            System.out.println("2이다");
        }else if (num==3) {
            System.out.println("3이다");
        }
    }
}
