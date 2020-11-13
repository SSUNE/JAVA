public class For2002 {
    public static void main(String[] args) {

        //for
        int dan;
        int times; // 곱해지는 수 (1부터 시작)

        for (dan = 2; dan <= 4; dan++){ //단은 2단부터 시작; 단은 9단까지; 단은 2에서 9까지 증가
            for (times = 1; times <= 9; times++){
                System.out.println(dan + "*" + times + "=" + (dan * times));
            }
            System.out.println();
        }

        System.out.println();

        //while
        int dan2 = 2;
        int times2; // 곱해지는 수 (1부터 시작)

        while (dan2 <= 4){ //단은 2단부터 시작; 단은 9단까지; 단은 2에서 9까지 증가

            times2 = 1;
            while ( times2 <= 9){
                System.out.println(dan2 + "*" + times2 + "=" + (dan2 * times2));
                times2++;
            }
            System.out.println();
            dan2++;
        }

        System.out.println();

        //do-while
        int dan3 = 2;
        int times3; // 곱해지는 수 (1부터 시작)

        do { //단은 2단부터 시작; 단은 9단까지; 단은 2에서 9까지 증가

            times3 = 1;
            do {
                System.out.println(dan3 + "*" + times3 + "=" + (dan3 * times3));
                times3++;
            }while ( times3 <= 9);
            System.out.println();
            dan3++;
        }while (dan3 <= 4);

    }
}
