public class Repeat004 {
    public static void main(String[] args) {

        // for
        int sum = 0;
        boolean first = true;

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum += i;   //3의 배수의 합
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
        // 1. 초기값   2. 조건식   3. 증감문
        first = true;
        sum = 0;
        int k = 1;
        while (k <= 10) {
            if (k % 3 == 0) {
                if (first) {
                    first = false;
                } else {
                    System.out.print("+");
                }
                sum += k;
                System.out.print(k);
            }
            k++;
        }
        System.out.print("=" + sum);

        System.out.println();


        // do - while
        first = true;
        sum = 0;
        int j = 1;
        do {
            if (j % 3 == 0) {
                if (first) {
                    first = false;
                } else {
                    System.out.print("+");
                }
                sum += j;
                System.out.print(j);
            }
            j++;
        } while (j <= 10);
        System.out.print("=" + sum);

        System.out.println();


        int q = 1, num = 0;
        first = true;
        do {
            if (q % 3 == 0) {
                switch (q) {  //3
                    case 3:
                        first = false;
                        break;
                    case 10:  //i 가 10이라면...
                        System.out.print("=");
                        break;

                    default:
                        System.out.print("+");
                }
                num += q;
                System.out.print(q);
            }// end
            q++;
        } while (q <= 10);
        System.out.println("=" + num + " / {do while}");
    }


}

