public class Ex002 {
    public static void main(String[] args) {
        /*
        1~20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합을
	    for , while , do while문을 이용해서   처리하시오.

	    1 + 5 + 7  +11  +13  +17  +19 = 73
        */

        // for
        int sum = 0;
        boolean first = true;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
                if (first) {
                    first = false;
                } else {
                    System.out.print("+");
                }
                System.out.print(i);
            }
        }
        System.out.print("=" + sum);
        System.out.println();

        // while
        int sum2 = 0;
        boolean first2 = true;
        int i = 1;
        while (i <= 20) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum2 += i;
                if (first2) {
                    first2 = false;
                } else {
                    System.out.print("+");
                }
                System.out.print(i);
            }
            i++;
        }
        System.out.print("=" + sum);
        System.out.println();

        // do-while
        int sum3 = 0;
        boolean first3 = true;
        int e = 1;
        do {
            if (e % 2 != 0 && e % 3 != 0) {
                sum3 += e;
                if (first3) {
                    first3 = false;
                } else {
                    System.out.print("+");
                }
                System.out.print(e);
            }
            e++;
        } while (e <= 20);
        System.out.print("=" + sum);
        System.out.println();


    }
}
