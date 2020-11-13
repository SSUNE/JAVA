public class For2011 {
    public static void main(String[] args) {
        /*
        ABCDEFGHIJKLMNOPQRSTUVWXYZ
	    ABCDEFGHIJKLMNOPQRSTUVWXY
	    ABCDEFGHIJKLMNOPQRSTUVWX
	    ... 중간생략...
	    ABC
	    AB
	    A
        */

        //for
        for (char i = 'Z'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //while
        char i = 'Z';
        while (i >= 'A') {
            char j = 'A';
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i--;
        }

        System.out.println();

        //while
        char ei = 'Z';
        do {
            char j = 'A';
            do {
                System.out.print(j);
                j++;
            } while (j <= ei);
            System.out.println();
            ei--;
        } while (ei >= 'A');

    }
}
