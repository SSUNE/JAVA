import java.util.Scanner;

public class Switch011 {
    public static void main(String[] args){
        /*
        가위(1),바위(2), 보(3) 중 하나를 입력하세요.>_입력받기
	당신은 1입니다.
	컴은  2입니다.
	당신이 졌습니다.

	힌트!) 랜덤하게 숫자받기
	System.out.println("1: 0~1사이의 난수 : " + Math.random());
	System.out.println("2: 0,1,2 중 출력 : " + (int)(Math.random() * 3));
	System.out.println("3: 1,2,3 중 출력 : " + (int)(Math.random() * 3) + 1);
         */

        // 변수
        int user = 0, com = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 가위(1),바위(2), 보(3) 중 하나를 입력하세요.> ");
        user = scanner.nextInt();

        // 입력
        /*
        System.out.println( Math.random() ); // 0~0.9999
        System.out.println( Math.random()*3 ); // 0~2.9999
        System.out.println( (int)Math.random()*3 ); // 0~2.9999
        System.out.println( (int)Math.random()*3 +1 ); // 0~2.9999
        */

        com = (int) (Math.random()*3) +1;

        // 처리
        switch (user) {
            case 1 : result = (com==2) ? "당신이 졌습니다" : (com==3) ? "당신이 이겼습니다" : "무승부입니다."; break;
            case 2 : result = (com==3) ? "당신이 졌습니다" : (com==1) ? "당신이 이겼습니다" : "무승부입니다."; break;
            case 3 : result = (com==2) ? "당신이 졌습니다" : (com==1) ? "당신이 이겼습니다" : "무승부입니다."; break;
            


        }
        // 출력
        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴은 " + com + "입니다.");
        System.out.println(result);

    }
}
