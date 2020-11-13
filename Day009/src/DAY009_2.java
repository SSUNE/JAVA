import java.util.Scanner;

public class DAY009_2 {
    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);


        for (;;){
            System.out.print("1을 입력하세요 > ");
            num = scanner.nextInt();
            if (num==1){
                break;
            }
        }
    }
}
