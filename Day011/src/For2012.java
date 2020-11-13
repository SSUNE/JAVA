public class For2012 {
    public static void main(String[] args) {
        /*
        ★★★★
	    ★★★★
	    ★★★★
	    ★★★★
        */

        //for
        for (int a = 1; a < 5; a++) {
            for (int b = 1; b < 5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //while
        int a = 1;
        while (a < 5) {
            int b = 1;
            while (b < 5) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }

        System.out.println();

        //do-while
        int a2 = 1;
        do {
            int b = 1;
            do {
                System.out.print("*");
                b++;
            } while (b < 5);
            System.out.println();
            a2++;
        } while (a2 < 5);

    }
}
