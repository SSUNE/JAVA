

public class Day014_3 {
    public static void main(String[] args) {

        System.out.println("for문");
        for (int i = 110; i < 131; i += 10) {
            System.out.print(i + "\t");
        }

        System.out.println();

        System.out.println("while문");
        int i = 110;
        while (i < 131) {
            System.out.print(i + "\t");
            i += 10;
        }

        System.out.println();

        System.out.println("do-while문");
        int j = 110;
        do {
            System.out.print(j + "\t");
            j += 10;
        } while (j < 131);

        System.out.println();

    }
}
