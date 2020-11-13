public class Method001 {
    //1. 함수구조 익히기   " 리턴값     함수이름    (파라미터){} "
    //   함수이름만 hi() 부르면 자동으로  {}까지 처리
    //   public (어디에서나 접근가능)
    //   static (Method001라는 클래스안에 멤버, 공용가능)
    //   void (리턴값  :  {} 안에 처리한 값, 처리한 숫자나 문자열 호출한 곳에 결과물 보고할 것이 없으면 void쓰면됨)
    //   () 재료, 인수, 인자, 파라미터가 들어갈 곳

    // 2-1. 함수정의
    public static void hi() {
        System.out.println("hi");
    }
    public static void line() {
        System.out.println("=====================");
    }


    public static void main(String[] args) {
        /*
        1. 메서드의 개요
            - 코드의 재사용
            - 실행하고자하는 명령어들을 한꺼번에 모아놓고 함수이림이 호출되면 실행되는 기능
            - function, method, 멤버함수
        2. 사용법
            2-1. 함수정의
            2-2. 함수호출

            - 함수를 호출(2-2) 을 했는데 함수정의(2-1)가 없으면 오류가 발생.
            - 함수정의(2-1)만하고 호출(2-2)하지않으면 문제가 발생 안됨.

        3. 메서드이름 작성규칙
            - 처리하는 내용의 의미를 담아서 작성
            - 함수의 첫글자는 (소)문자    *클래스명 - (대)문자
            - main() 함수안에서 함수정의는 불가능 (함수호출은 가능) ★★★

        4. 종료
            1) 함수 기본구조
            2) 매개변수(파라미터/parameter) 전달값
            3) 리턴값
            4) 오버로딩
            5) 재귀함수
         */

        System.out.println("=====================");
        System.out.println("[ ver.1 ]");
        System.out.print("HI");
        System.out.print("HI");
        System.out.print("HI");

        line();  // 2-2. 함수호출
        System.out.println("[ ver.2 ]"); //
        hi(); // 2-2. 함수호출

    }
}
