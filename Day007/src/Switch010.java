import java.util.Scanner;

public class Switch010 {
    public static void main(String[] args){

        char jumin = ' ';
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 당신의 주민번호를 입력하십시오(011231-1111222) > ");
        jumin = scanner.next().charAt(7);

        switch (jumin) {
            case '1' :  case '3' :
                switch (jumin) {
                    case '1' : result = jumin + "이면 남자 - 1900년대생입니다."; break;
                    case '3' : result = jumin + "이면 남자 - 2000년대생입니다."; break;
                } break;
            case '2' :  case '4' :
                switch (jumin) {
                    case '2' : result = jumin + "이면 여자 - 1900년대생입니다."; break;
                    case '4' : result = jumin + "이면 여자 - 2000년대생입니다."; break;
                } break;
            default: result = "유효하지 않는 주민등록번호입니다.";



        }

        System.out.println(result);

    }
}
