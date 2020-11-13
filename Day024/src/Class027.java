public class Class027 {
    public static void main(String[] args) {
        /*
        1. 지역변수와 인스턴스변수를 고르시오.
            - 인스턴스 변수 :
            - 지역 변수 : str1, str2, str3, for문안에 있는 int i

        2. runtime data area에서 저장되는 위치를 적으시오.
            - 인스턴스 변수 : heap area
            - 지역 변수 : stack area (중괄호를 쓰면 stack area)

        3. 다음을 작성해보고 출력되는 결과와 설명을 붙이시오.
            test1 : 같다  ->  "monday"라는 주소를 str1과 st2가 동일하게 가지고있다. (stack의 주소비교)
            test2 : 같다  ->  str1과 str2가 내용이 동일함.
            test3 : 다르다  ->  str1과 str3은 주소가 다르다.
            test4 : 같다 -> str1과 str3가 내용이 동일함.

         */

        String str1 = "monday";
        String str2 = "monday";
        String str3 = new String("monday");
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("test1 : " + ((str1 == str2)? "같다" : "다르다"));
        System.out.println("test2 : " + ((str1.equals(str2))? "같다" : "다르다"));
        System.out.println("test3 : " + ((str1 == str3)? "같다" : "다르다"));
        System.out.println("test4 : " + ((str1.equals(str3))? "같다" : "다르다"));

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

    }
}
