import java.util.Scanner;

public class For013 {
    public static void main(String[] args) {
        // 1. 예상되는 결과는?
        // 1    2   3   4
        for (int i=1; i<11; i++) {
            if(i == 5) {
                break; //아예 빠져나옴.
            }
            System.out.print(i + "\t");
        }
        // 2. 예상되는 결과는?
        // 1    2   3   4   6   7   8   9   10
        System.out.println();
        for (int i=1; i<11; i++){
            if (i == 5) {
                continue; //한번만 스킵하는 효과.
            }
            System.out.print(i + "\t");
        }
        // 3. 1을 입력할 때까지 무한반복
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int num=0;

        for (;;) { // 초기값; 조건문; 증감문 - 제약조건이 아무것도 없음. (1. 무한 반복) why? 조건이 없기때문에 무한 반복돈다.
            System.out.println("1을 입력해주세요 > ");
            num = scanner.nextInt();
            if (num == 1) {
                break;  // 2. 빠져나올 조건
            }
        }
        System.out.println("입력받은 숫자는 " + num + "입니다.");


    }
}
