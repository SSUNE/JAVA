import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class For012 {
    public static void main(String[] args) {
        // 두수사이의 합을 구하시오
        //	숫자1입력 : 2
        //	숫자2입력 : 5
        //	      2+3+4+5=14
        //	      5+4+3+2=14

        /*
        int a=0, b=0, sum=0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력(정수) > ");  a=scanner.nextInt();
        System.out.println("숫자입력(정수) > ");  b=scanner.nextInt();

        // 작은 수에서 큰수로 for문 이용해서 합
        if (a<b) {
            for (int i = a; i<=b; i++) {
                if (first) {
                    first = false;
                }else {
                    System.out.print("+");
                }
                    System.out.print(i);
                    sum += i;
                }
                System.out.print("=" + sum);
            }else {
            for (int i = a; i>=b; i--){
                if (first){
                    first = false;
                }else {
                    System.out.print("+");
                }
                System.out.print(i);
                sum += i;
            }
            System.out.print("=" + sum);
        }
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력(정수) > ");
        int a = scanner.nextInt();
        System.out.println("숫자입력(정수) > ");
        int b = scanner.nextInt();

        System.out.println(IntStream.range(a, b + 1).mapToObj(String::valueOf).collect(Collectors.joining("+")) + "=" + IntStream.range(a, b + 1).sum());
    }
}
