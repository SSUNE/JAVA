import java.util.Scanner;

public class Switch008 {
    public static void main(String[] args){

        /*
        당신의 나이를 입력하시오.
	    (19~30대)청년, 중년(40대~), 장년(50~), 노인(60~이)  이 나오게 하세요!
         */
        int age = 0;
        String result= "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 나이를 입력하시오 > ");
        age = scanner.nextInt();

        // case안쪽에 if/삼항연산자를 조건을 붙니는 구문사용가능하다.
        switch (age/10) {
            case 0 : case 1 : result = (age == 19)? "청년" : "-"; break;
            case 2 : case 3 : result = "청년"; break;
            case 4 :          result = "중년"; break;
            case 5 :          result = "장년"; break;
            default: result = "노인"; break;

        }
        System.out.println(result);

    }
}
