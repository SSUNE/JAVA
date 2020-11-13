public class For2015_2 {
    public static void main(String[] args) {

        int dan = 0, i = 0;
        //for
        for (dan = 2; dan < 10; dan += 3) {
            for (i = 1; i < 4; i++) {
                if (dan == 8) {
                    System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
                    System.out.print(dan + 1 + " * " + i + " = " + ((dan + 1) * i) + "\t");
                    System.out.println();
                } else {
                    System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
                    System.out.print(dan + 1 + " * " + i + " = " + ((dan + 1) * i) + "\t");
                    System.out.print(dan + 2 + " * " + i + " = " + ((dan + 2) * i) + "\t");
                    System.out.println();
                }
            }
            System.out.println();
        }

        System.out.println();

        //while
        int dan2 = 2; int ii = 0;
        while (dan2 < 10) {
            ii = 1;
            while (ii < 4) {
                if (dan2 == 8) {
                    System.out.print(dan2 + " * " + ii + " = " + (dan2 * ii) + "\t");
                    System.out.print(dan2 + 1 + " * " + ii + " = " + ((dan2 + 1) * ii) + "\t");
                    System.out.println();
                } else {
                    System.out.print(dan2 + " * " + ii + " = " + (dan2 * ii) + "\t");
                    System.out.print(dan2 + 1 + " * " + ii + " = " + ((dan2 + 1) * ii) + "\t");
                    System.out.print(dan2 + 2 + " * " + ii + " = " + ((dan2 + 2) * ii) + "\t");
                    System.out.println();
                }
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
                if (dan3 == 8){
                    System.out.print(dan3 + " * " + iii + " = " + (dan3 * iii) + "\t");
                    System.out.print(dan3 + 1 + " * " + iii + " = " + ((dan3 + 1) * iii) + "\t");
                    System.out.println();
                }else {
                    System.out.print(dan3 + " * " + iii + " = " + (dan3 * iii) + "\t");
                    System.out.print(dan3 + 1 + " * " + iii + " = " + ((dan3 + 1) * iii) + "\t");
                    System.out.print(dan3 + 2 + " * " + iii + " = " + ((dan3 + 2) * iii) + "\t");
                    System.out.println();
                }
                iii++;
            } while (iii < 4);
            System.out.println();
            dan3 += 3;
        } while (dan3 < 10);
    }
}
/*
2 * 1 = 2	3 * 1 = 3	4 * 1 = 4
2 * 2 = 4	3 * 2 = 4	4 * 2 = 6
2 * 3 = 6	3 * 3 = 5	4 * 3 = 8

5 * 1 = 5	6 * 1 = 6	7 * 1 = 7
5 * 2 = 10	6 * 2 = 7	7 * 2 = 9
5 * 3 = 15	6 * 3 = 8	7 * 3 = 11

8 * 1 = 8	9 * 1 = 9
8 * 2 = 16	9 * 2 = 10
8 * 3 = 24	9 * 3 = 11
 */