import java.util.Scanner;

public class For012_2 {
    public static void main(String[] args) {
        // 두수사이의 합을 구하시오
        //	숫자1입력 : 2
        //	숫자2입력 : 5
        //	      2+3+4+5=14
        //	      5+4+3+2=14

        int a = 0, b = 0, sum = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력(정수) > ");
        a = scanner.nextInt();
        System.out.println("숫자입력(정수) > ");
        b = scanner.nextInt();

        for (int i = a, j = a; i <= b || j >= b; i++, j--) {
            if (first) {
                first = false;
            } else {
                System.out.print("+");
            }
            if (a < b) {
                System.out.print(i);
                sum += i;
            } else if (a > b) {
                System.out.print(j);
                sum += j;
            }

        }
        System.out.print("=" + sum);
    }
}
