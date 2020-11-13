public class For2014 {
    public static void main(String[] args) {
        /*
        ★★★★
	    ★★★
	    ★★
	    ★
        */

        //for
        for (int a = 5; a > 1; a--) {
            for (int b = 1; b < a; b++) {
                System.out.print("★");
            }
            System.out.println();
        }

        //while
        System.out.println();
        int a = 5;
        while (a > 1) {
            int b = 1;
            while (b < a) {
                System.out.print("★");
                b++;
            }
            System.out.println();
            a--;
        }

        //do-while
        System.out.println();
        int c = 5;
        while (c > 1) {
            int f = 1;
            while (f < c) {
                System.out.print("★");
                f++;
            }
            System.out.println();
            c--;
        }

    }
}
