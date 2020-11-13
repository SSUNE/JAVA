import java.util.Scanner;

public class Switch002 {
    public static void main(String[] args){

        int a = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 1개 입력하시오(3,6,9,12) > ");
        a = scanner.nextInt();

        switch (a) {
            case 3 : result="봄이다"; break;
            case 6 : result="여름이다"; break;
            case 9 : result="가을이다"; break;
            case 12 : result="겨울이다"; break;
        }

        System.out.println(result);

    }
}
