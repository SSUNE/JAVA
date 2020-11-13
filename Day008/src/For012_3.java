import java.util.Scanner;

public class For012_3 {
    public static void main(String[] args) {
        // 두수사이의 합을 구하시오
        //	숫자1입력 : 2
        //	숫자2입력 : 5
        //	      2+3+4+5=14
        //	      5+4+3+2=14

        int num1=0, num2=0, sum=0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력(정수) > ");  num1=scanner.nextInt();
        System.out.println("숫자입력(정수) > ");  num2=scanner.nextInt();

        for (int i = num1; i<=num2; i++){
            if (first){
                first = false;
            }else {
                System.out.print("+");
            }
            System.out.print(i);
            sum += i;
        }
        System.out.print("=" + sum);

        // 초기화, 숫자 바꾸기, 숫자 백업
        System.out.println();
        sum = 0; first = true;
        int backup = num1; num1 = num2; num2 = backup;
        for (int j=num1; j>=num2; j--){
            if (first) {
                first = false;
            }else {
                System.out.print("+");
            }
            System.out.print(j);
            sum +=j;
        }
        System.out.print("=" + sum);
    }
}
