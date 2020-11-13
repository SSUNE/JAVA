public class Ex003 {
    public static void main(String[] args) {
       /* 1+(1+2)+(1+2+3)+.....(1+2+3+....+10)=220의 결과를 계산하시오.
        for , while , do while문을 이용해서   처리하시오.*/

        //for
        int sum = 0, sub = 0;
        for (int i = 1; i <= 10; i++) {
            sub += i;
            sum += sub;
        }
        System.out.println(sum);

        //while
        int sum2 = 0, sub2 = 0;
        int u = 1;
        while (u <= 10) {
            sub2 += u;
            sum2 += sub2;
            u++;
        }
        System.out.println(sum2);

        //do-while
        int sum3 = 0, sub3 = 0;
        int y = 1;
        do {
            sub3 += y;
            sum3 += sub3;
            y++;
        } while (y <= 10);
        System.out.println(sum3);
    }
}
