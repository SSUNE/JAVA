public class For2015 {
    public static void main(String[] args) {

        //for
        int dan = 0, i = 0;

        for (dan = 2; dan < 8; dan += 3) {
            for (i = 1; i < 4; i++) {
                System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
                System.out.print(dan + 1 + " * " + i + " = " + ((dan + 1) * i) + "\t");
                System.out.print(dan + 2 + " * " + i + " = " + ((dan + 2) * i) + "\t");
                System.out.println();
            }
            System.out.println();
        }

        System.out.println();

        //while
        int dan2 = 0, ii = 0;

        dan2 = 2;
        while (dan2 < 8) {
            ii = 1;
            while (ii < 4) {
                System.out.print(dan2 + " * " + ii + " = " + (dan2 * ii) + "\t");
                System.out.print(dan2 + 1 + " * " + ii + " = " + ((dan2 + 1) * ii) + "\t");
                System.out.print(dan2 + 2 + " * " + ii + " = " + ((dan2 + 2) * ii) + "\t");
                System.out.println();
                ii++;
            }
            System.out.println();
            dan2 += 3;
        }

        System.out.println();

        //do-while
        int dan3 = 0, iii = 0;

        dan3 = 2;
        do {
            iii = 1;
            do {
                System.out.print(dan3 + " * " + iii + " = " + (dan3 * iii) + "\t");
                System.out.print(dan3 + 1 + " * " + iii + " = " + ((dan3 + 1) * iii) + "\t");
                System.out.print(dan3 + 2 + " * " + iii + " = " + ((dan3 + 2) * iii) + "\t");
                System.out.println();
                iii++;
            } while (iii < 4);
            System.out.println();
            dan3 += 3;
        } while (dan3 < 8);

    }
}


 /*
            2*1=2   3*1=3   4*1=4
            2*2=4   3*2=6   4*2=8
            2*3=6   3*3=9   4*3=12

            5*1=5   6*1=6   7*1=7
            5*2=10  6*2=12  7*2=14
            5*3=15  6*3=18  7*3=21
        */