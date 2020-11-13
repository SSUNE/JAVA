public class Class026 {
    public static void main(String[] args) {
        /*
        1. 인스턴스변수와 클래스 변수를 고르시오.
            - 인스턴스 변수 : a
            - 클래스 변수 : COMPANYNAME

        2. 각각의 변수가 runtime data area에서 저장되는 위치를 적으시오.
            - a : heap area 저장
            - COMPANYNAME : Method area 저장

        3. 다음과 같이 출력하시오.
            클래스 변수 - (주) 프로그램시작부터 종료까지
            인스턴스 변수 - 0
         */
        Class026 a1 = new Class026();
        System.out.println("클래스 변수 - " + COMPANYNAME);
        System.out.println("인스턴스 변수 - " + a1.a);

    }
    public static String COMPANYNAME = "(주) 프로그램시작부터 종료까지";
    int a;

    /*@Override
    public String toString() {
        return "Class026{" +
                "a=" + a +
                '}';
    }

     */
}
