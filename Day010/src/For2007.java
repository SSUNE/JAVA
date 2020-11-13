public class For2007 {
    public static void main(String[] args) {


        //for
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 100; k++) {
                sum += k;
                if (k / 10 == i) {
                    System.out.print("+" + k + "=" + sum + "\n");
                    sum = 0;
                    break;
                } else if (k == 1) {
                    System.out.print(k);
                } else System.out.print("+" + k);
            }
        }

        //while
        int sum2 = 0;
        int i = 1;
         while ( i <= 10) {
             int k = 1;
             while ( k <= 100) {
                sum2 += k;
                if (k / 10 == i) {
                    System.out.print("+" + k + "=" + sum2 + "\n");
                    sum2 = 0;
                    break;
                } else if (k == 1) {
                    System.out.print(k);
                } else System.out.print("+" + k);
                k++;
            }
            i++;
        }

         //do-while
        int sum3 = 0;
        int q = 1;
        do {
            int a = 1;
            do {
                sum3 += a;
                if (a / 10 == q) {
                    System.out.print("+" + a + "=" + sum3 + "\n");
                    sum3 = 0;
                    break;
                } else if (a == 1) {
                    System.out.print(a);
                } else System.out.print("+" + a);
                a++;
            }while ( a <= 100);
            q++;
        }while ( i <= 10);

    }

}
