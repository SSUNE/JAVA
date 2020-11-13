public class For2010 {
    public static void main(String[] args) {
        /*
        A
	    AB
	    ABC
	    ... 중간생략...
	    ABCDEFGHIJKLMNOPQRSTUVWX
	    ABCDEFGHIJKLMNOPQRSTUVWXY
	    ABCDEFGHIJKLMNOPQRSTUVWXYZ
        */


        //for
        for (char i = 'A'; i <= 'Z'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //while
        char i = 'A';
        while (i <= 'Z') {
            char j = 'A';
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        //do-while
        char ei = 'A';
        do {
            char j = 'A';
            do {
                System.out.print(j);
                j++;
            }while (j <= ei);
            System.out.println();
            ei++;
        }while (ei <= 'Z');

    }
}
