public class MethodApi001 {
    public static void main(String[] args) {
        System.out.println("001. Math");
        //TODO _ 필수 : 절대값, 큰수, 작은수, 랜덤
        // Math.random()    - Math마우스올리기 / f2 / 지구본모양버튼클릭 => api로 넘어감.

        System.out.println(Math.random());
        // double java.lang.Math.random() : return 값 /  메서드이름 / () 파라미터
        System.out.println(Math.PI);
        // SF(static / final)
        System.out.println(Math.abs(-10));
        // int java.lang.Math.abs(int a)
        System.out.println(Math.abs(-2.1)); // 절대값
        System.out.println(Math.max(10, 3)); // 최대값
        System.out.println(Math.min(10, 3)); // 최소값

        // Q1) int ma = 10, mb = 20, mc = 30; Math.max를 이용해서 제일 큰수찾기
        int ma = 10, mb = 20, mc = 30;
        System.out.println(Math.max(Math.max(ma, mb), mc));

        // Q2) 다음의 결과값을 적어보고 어떤 의미인지 적으시오.
        System.out.println(Math.round(1.5f)); //소수점 이하를 반올림
        System.out.println(Math.ceil(1.1f)); //소수점 이하를 올림
        System.out.println(Math.ceil(1.9f)); //소수점 이하를 올림
        System.out.println(Math.floor(1.1f)); //소수점 이하를 버림/내림
        System.out.println(Math.floor(1.9f)); //소수점 이하를 버림/내림
        // Q3) 1~45까지의 숫자 랜덤하게 나오게 만들기 (Math.random())
        System.out.println("0 <= x < 1 : " + Math.random());
        System.out.println("0 <= x < 44.xxxx : " + Math.random() * 45);
        System.out.println("0 <= x < 44 : " + (int) Math.random() * 45);
        System.out.println("0 <= x < 45 : " + (int) (Math.random() * 45) + 1);
        System.out.println((int) (Math.random() * 45) + 1);

    }// end main
}
