public class For2009 {
    public static void main(String[] args) {
        /*
       FOR WHILE DO WHILE 버젼으로 작업해주세요!! ↓
       [기본] 클래스명 : For2009
        1+...+10=55
        11+...+20=155
        21+...+30=255
        31+...+40=355
        41+...+50=455
        51+...+60=555
        61+...+70=655
        71+...+80=755
        81+...+90=855
        91+...+100=955
        */

        //for
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (i % 10 == 0) {
                System.out.println(i - 9 + "+...+" + i + " = " + sum);
                sum = 0;
            }
        }

        System.out.println();

        //while
        sum = 0;
        int i = 1;
        while ( i <= 100) {
            sum = sum + i;
            if (i % 10 == 0) {
                System.out.println(i - 9 + "+...+" + i + " = " + sum);
                sum = 0;
            }
            i++;
        }

        System.out.println();

        //while
        sum = 0;
        int ai = 1;
        do {
            sum = sum + ai;
            if (ai % 10 == 0) {
                System.out.println(ai - 9 + "+...+" + ai + " = " + sum);
                sum = 0;
            }
            ai++;
        }while ( ai <= 100);

    }
}
