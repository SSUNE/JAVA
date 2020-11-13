import java.time.LocalDate;
import java.util.stream.IntStream;

public class For011 {
    public static void main(String[] args) {
        // 1~10중에서 짝수의 합계를 구하시오.

     /*   int sum=0;

        for (int i = 1; i<=10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1~10중에서 짝수의 합계 : " + sum);

*/

        System.out.println("1~10중에서 짝수의 합계 : " + IntStream.range(1, 11).filter(i -> i % 2 == 0).sum());

        LocalDate date = LocalDate.of(2020, 1, 1);
        System.out.println(date.isLeapYear() ? "윤년인데숭" : "윤년아닌데숭");
    }
}
