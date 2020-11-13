public class Wraper001 {
    /*
    api 안내
    - wrapper클래스는 기본자료형의 업그레이드기능들을 자바팀에서 만들어 놨다.
      int a = 5; // 2진법으로 만들어주세요.
    ▼ Wrapper 클래스(감싸는 클래스)
    1. 기본자료형 (boolean, byte, short, int, long, float, double, char)
       의 데이터 타입을 객체화할 수 있는 클래스들
       ✬ 참조형(String)
    2. int vs Integer
       int는 하나의 정수의 값만을 보관                 → 단순한 값 처리시 사용
       Integer는 정수를 저장 + 기능(메서드)들을 포함
     */
    public static void main(String[] args) {
        System.out.println("ver-1");
        System.out.println("10" + 3); // 103
        System.out.println(Integer.parseInt("10") + 3); // 13
        System.out.println(Integer.parseInt("-10") + 3); //7
        // 리턴 int java.lang.Integer.parseInt : 메서드명 (tring s : 파라미터)

        System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
    }
}
