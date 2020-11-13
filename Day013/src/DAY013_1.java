import java.util.Scanner;

public class DAY013_1 {
    public static void main(String[] args) {

        int a = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("10, 20, 30 중에 입력하세요 > ");
        a = scanner.nextInt();

        if (a == 10){
            System.out.println("ten");
        }else if (a == 20){
            System.out.println("twenty");
        }else if (a == 30){
            System.out.println("thirty");
        }
    }
}
