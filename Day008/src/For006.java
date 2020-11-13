public class For006 {
    public static void main(String[] args) {
        // 1~10까지 3의 배수의 합을 출력하시오.
        //	1~10까지 3의 배수의 합 : 3+6+9 = 18

        int sum = 0;
        boolean first = true;

        for (int i=1; i<=10; i++) {
            if (i%3 == 0) {
                sum += i;   //3의 배수의 합
                if (first) {first = false;
                    System.out.println(first);}    //맨처음만 true / 다음엔 false
                // 첫번째 숫자에만 +빠지기 (+6, +9 이렇게 숫자 앞ㅇ +를 붙일껀데 3은 앞에 +를 안 붙이기)
                else {System.out.print("+");}
                System.out.print(i);
            }
        }
        System.out.print("=" + sum);    // = 18 출력*/



    }
}
