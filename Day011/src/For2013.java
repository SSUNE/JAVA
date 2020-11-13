public class For2013 {
    public static void main(String[] args) {
        /*
        ★
	    ★★
	    ★★★
	    ★★★★
        */

        //for
        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < a; b++) {
                System.out.print("★");
            }
            System.out.println();
        }

        //while
        int a = 1;
        while (a < 6) {
            int b = 1;
            while (b < a) {
                System.out.print("★");
                b++;
            }
            System.out.println();
            a++;
        }

        System.out.println();

        //do-while
        int a2 = 2;
        do {
            int b = 1;
            do {
                System.out.print("★");
                b++;
            } while (b < a2);
            System.out.println();
            a2++;
        } while (a2 < 6);


    }
}
