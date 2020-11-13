public class For001 {
    public static void main(String[] args) {
        // 1, 2, 3 출력
        System.out.println("ver-1");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println();
        System.out.println("ver-2");
        System.out.println("1. 반복구문을 찾아서 {}      : { System.out.println(3); }");
        System.out.println("2. 바뀌는 부분을 찾아서 변경   : { System.out.println(변수); }");
        System.out.println("3. 패턴 찾기 : for(시작; 종료; 변화)\n for(초기문; 조건문; 증감문)");

        for (int i=1; i<4; i++){
            System.out.println(i);
        }

        for (int i=1; i<11; i++){       // 1~10까지 반복하겠다.
            System.out.println(i);
        }

        for (int i=3; i<9; i++){        // 3~8까지 반복하겠다.
            System.out.println(i);
        }

    }
}
