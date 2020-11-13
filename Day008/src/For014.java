import java.util.Scanner;

public class For014 {
    public static void main(String[] args) {
        /*
        만약 조용필씨의 나이(70)를 입력했다면 팬이시군요! 출력 -> 빠져나오기
        아니라면 다시도전! 출력 후 무한 반복

        for(;;){
        --> 조용필의 나이 입력받기
        --> 만약 잘 입력했다면 빠져나오기 (break)
        --> 아니라면 다시 도전 출
        }
         */

        // 변수
        int age = 0;
        Scanner scanner = new Scanner(System.in);


        // 입력 + 처리
        for (;;){
            System.out.println("나훈아씨의 나이를 입력하세요 > ");
            age = scanner.nextInt();
            if (age == 70) {
                System.out.println("팬이시군요!");
                break;
            }else {System.out.println("다시도전!");
            }
        }
    }
}
